package view.Login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

import java.util.Map;

import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichLink;

import oracle.adf.view.rich.component.rich.output.RichImage;

import view.DatabaseConnection.DatabaseConnection;


public class Login {

    private static int grpCount = 0;
    private static int cmpnyCount = 0;
    private static int sbuCount = 0;
    private RichInputText it1;
    private RichInputText it2;

    private static String role_id;
    private static String user_id;
    private static String role_type;
    private static String portal_name;
    private static String portal_id;
    private static String portal_std_id;
    private static String portal_prt_id;
    private static String portal_stf_id;
    private static String sessUName;
    private static String sessImage;
    private static String sessCmpnyName;

    private static String grp_id;
    private static String cmpny_id;
    private static String sbu_id;


    public Login() {
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public String showMessage(String msgs) {
        String messageText = msgs;
        FacesMessage fm = new FacesMessage(messageText);
        /**
             * set the type of the message.
             * Valid types: error, fatal,info,warning
             */
        fm.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, fm);
        return null;
    }

    public static void storeOnSession(String key, Object object) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        Map sessionState = ctx.getExternalContext().getSessionMap();
        sessionState.put(key, object);
    }

    //user logging in
    public String login_action() {

        grpCount = 0;
        cmpnyCount = 0;
        sbuCount = 0;
        // Add event code here...
        //SETTING VALUE PROGRAMMATICALLY IN PASSWORD FIELD,,,,ONLY TESTING
        //  //          it2.setValue("bla bla bla");
        String username = this.getIt1().getValue().toString();
        String password = this.getIt2().getValue().toString();

        sessUName = username;
        storeOnSession("sessUName", sessUName);
        System.out.println("value for session..............." + sessUName);

        System.out.println(".......................................................................");
        System.out.println(".......................................................................");
        System.out.println("Entered username is : " + username + "....and password is : " + password);
        System.out.println(".......................................................................");
        System.out.println(".......................................................................");

        Connection conn;

        try {
            conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rset = stmt.executeQuery("SELECT * FROM tbl_user where name = '" + username + "' and pwd = '" + password + "'");

            if (rset.next()) {
                //                conn.close();
                //getting data against column from table
                role_id = (rset.getString("role_id")).toString();
                user_id = (rset.getString("id")).toString();

                try {
                    portal_name = (rset.getString("portal_name")).toString();
                    portal_id = (rset.getString("portal_id")).toString();
                    System.out.println(portal_id+",,,,,,,,,,,,,,,,,,,,,,,,,");
                    
                } catch (Exception e) {
                //                     TODO: Add catch code
                //                    e.printStackTrace();
                    System.out.println("In tbl user Portal_id is null, might be it is general user");
                }
                
                    
                ResultSet rsetrole = stmt.executeQuery("SELECT * FROM tbl_role where id = '" + role_id + "'");
                if (rsetrole.next()) {
                    role_type = (rsetrole.getString("role_type").toString());
                }
                
                
                switch(role_type){
                
                case "GRL":
                    storeOnSession("sessPortalPrtId", "");
                    storeOnSession("sessPortalStdId", "");
                    storeOnSession("sessPortalStfId", "");
                    System.out.println("GRL");
                    break;
                
                case "PRT":
                        storeOnSession("sessPortalPrtId", portal_id);
                    System.out.println(portal_id+",,,,,,,,,,,,,,,,,,,,,,,,,"+"PRT");
                    break;
                
                case "STD":
                        storeOnSession("sessPortalStdId", portal_id);
                    System.out.println(portal_id+",,,,,,,,,,,,,,,,,,,,,,,,,"+"STD");
                    break;
                
                case "STF":
                        storeOnSession("sessPortalStfId", portal_id);
                    System.out.println(portal_id+",,,,,,,,,,,,,,,,,,,,,,,,,"+"STF");
                    break;
                
                default :
                    System.out.println(" no role type selected");
                    
                }

                
                //Storing value in session username from input text field and role_id from DB

                System.out.println(".........User Name stored in session is :..." + username + "...");
                //                System.out.println(".........User Password stored in session is :..." + password + "...");
                System.out.println(".........User Role stored in session is :..." + role_id + "...");
                System.out.println(".........User Master ID stored in session is :..." + user_id + "...");

                //              storing values in session
                storeOnSession("sessRMID", role_id);
                storeOnSession("sessUMID", user_id);
                storeOnSession("sessPortalName", portal_name);


                //                ResultSet rgset = stmt.executeQuery("SELECT COUNT(*) FROM tbl_role_group where role_id = '" + role_id + "'");
                //                rgset.next();
                //                int grpCount = rgset.getInt(1);
                //                System.out.println("Total groups assigned to role " + role_id + " are " + grpCount);


                ResultSet rgset = stmt.executeQuery("SELECT * FROM tbl_role_group where role_id = '" + role_id + "'");
                while (rgset.next()) {
                    grp_id = (rgset.getString("group_id")).toString();
                    System.out.println("got it grp id " + grp_id);
                    ++grpCount;
                }
                System.out.println("Total groups assigned to role " + role_id + " are " + grpCount);


                ResultSet rcset = stmt.executeQuery("SELECT * FROM tbl_role_company where role_id = '" + role_id + "'");
                while (rcset.next()) {
                    cmpny_id = (rcset.getString("group_company_id")).toString();
                    System.out.println("got it cmpny id " + cmpny_id);
                    ++cmpnyCount;
                }
                System.out.println("Total Companies assigned to role " + role_id + " are " + cmpnyCount);


                ResultSet rsset = stmt.executeQuery("SELECT * FROM tbl_role_sbu where role_id = '" + role_id + "'");
                while (rsset.next()) {
                    sbu_id = (rsset.getString("company_sbu_id")).toString();
                    System.out.println("got it sbu id " + sbu_id);
                    ++sbuCount;
                }
                System.out.println("Total Sbu assigned to role " + role_id + " are " + sbuCount);


                if (grpCount <= 1) {
                    storeOnSession("sessGrpID", grp_id);

                    if (cmpnyCount <= 1) {
                        storeOnSession("sessCmpnyID", cmpny_id);
                        try {
                            getCmpnyImg(cmpny_id);
                        } catch (Exception e) {
                            // TODO: Add catch code
                            e.printStackTrace();
                        }

                        if (sbuCount <= 1) {
                            return getSBUID(sbu_id);
                        }
                        if (sbuCount > 1) {
                            return getCompanyID(cmpny_id);
                        }
                    } else {

                        return getGroupID(grp_id);
                    }
                } else {
                    return "/faces/Main_Pages/Group/Group.jsf?faces-redirect=true";
                }


                //                rgset.close();
                stmt.close();
                conn.close();

                // return "/faces/Main_Pages/Group/Group.jsf?faces-redirect=true";
            } else {
                showMessage("Wrong Login Credentials");
                conn.close();
                System.out.println("........wrong login credentials........");
                //return "/faces/Main_Pages/Login.jsf?faces-redirect=true";
                return "false";

            }


        } catch (SQLException e) {
            System.out.println(e);
        }

        return role_id;
        //        return "/faces/Main_Pages/Dashboard.jsf?faces-redirect=true";
        //        return "good";
    }

    public String getGroupID(String GrpID) {
        System.out.println("ooooooooo GROUP oooooooooo" + GrpID);
        storeOnSession("sessGrpID", GrpID);
        return "/faces/Main_Pages/Group/Company/Company.jsf?faces-redirect=true";
    }

    public String getCompanyID(String CmpnyID) {
        System.out.println("oooooooooooo Company oooooooooo" + CmpnyID);
        storeOnSession("sessCmpnyID", CmpnyID);
        try {
            getCmpnyImg(CmpnyID);
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }

        return "/faces/Main_Pages/Group/Company/SBU/Sbu.jsf?faces-redirect=true";
    }

    public String getSBUID(String SBUID) {
        System.out.println("oooooooooooo SBU oooooooooo" + SBUID);
        storeOnSession("sessSBUID", SBUID);
        return "/faces/Main_Pages/Group/Company/SBU/Modules/ModuleBoard.jsf?faces-redirect=true";
    }

    public String getMODID(String MODID) {
        System.out.println("oooooooooooo MODID oooooooooo" + MODID);
        storeOnSession("sessMODID", MODID);

        int module_ID = Integer.parseInt(MODID);


        if (module_ID == 1) {
            return "/faces/Main_Pages/Group/Company/SBU/Modules/School_Management_System/SchlMngmtModuleBoard.jsf?faces-redirect=true";
        } else if (module_ID == 2) {
            return "/faces/Main_Pages/Group/Company/SBU/Modules/Payroll/PayrollModuleBoard.jsf?faces-redirect=true";
        } else if (module_ID == 3) {
            return "/faces/Main_Pages/Group/Company/SBU/Modules/User_Management/UserMngmtModuleBoard.jsf?faces-redirect=true";
        } else if (module_ID == 4) {
            return "/faces/Main_Pages/Group/Company/SBU/Modules/General_Ledger/GLModuleBoard.jsf?faces-redirect=true";
        } else if (module_ID == 5) {
            return "/faces/Main_Pages/Group/Company/SBU/Modules/Inventory/InventoryModuleBoard.jsf?faces-redirect=true";
        } else if (module_ID == 6) {
            return "/faces/Main_Pages/Group/Company/SBU/Modules/Sales/SalesModuleBoard.jsf?faces-redirect=true";
        } else if (module_ID == 7) {
            return "/faces/Main_Pages/Group/Company/SBU/Modules/Production/ProductionModuleBoard.jsf?faces-redirect=true";
        } else {
            System.out.println("-----nothing");
            return "good";
        }


        //        return "/faces/Main_Pages/Group/Company/SBU/Modules/School_Management_System/SchlMngmtModuleBoard.jsf?faces-redirect=true";

    }

    public String getCmpnyImg(String CmpyID) {
        Connection cone;

        try {
            cone = DatabaseConnection.getConnection();
            Statement stmt = cone.createStatement();
            ResultSet rset = stmt.executeQuery("SELECT * FROM TBL_GROUP_COMPANY where ID = '" + CmpyID + "'");

            if (rset.next()) {
                //                conn.close();
                //getting data against column from table
                sessCmpnyName = (rset.getString("NAME")).toString();
                storeOnSession("sessCmpnyName", sessCmpnyName);
                System.out.println(sessCmpnyName);

                sessImage = (rset.getString("IMAGE")).toString();
                storeOnSession("sessCmpnyImg", sessImage);
                //                System.out.println(sessImage);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return "df";
    }

    //Logout > session cleared and session variable cleared
    public String logout_action() {
        System.out.println("logout called");
        sessUName = "";
        role_id = "";
        user_id = "";
        portal_id = "";
        storeOnSession("sessUName", "");
        storeOnSession("sessRMID", "");
        storeOnSession("sessUMID", "");
        storeOnSession("sessPortalName", "");
        storeOnSession("sessPortalPrtId", "");
        storeOnSession("sessPortalStdId", "");
        storeOnSession("sessPortalStfId", "");
        storeOnSession("sessGrpID", "");
        storeOnSession("sessCmpnyID", "");
        storeOnSession("sessSBUID", "");
        storeOnSession("sessCmpnyName", "");
        storeOnSession("sessCmpnyImg", "");
        //        return "good";
        return "/faces/Main_Pages/Login.jsf?faces-redirect=true";
    }

}
