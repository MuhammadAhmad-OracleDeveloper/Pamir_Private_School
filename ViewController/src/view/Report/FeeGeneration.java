package view.Report;

import java.math.BigDecimal;

import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;

import view.DatabaseConnection.DatabaseConnection;

public class FeeGeneration {
    private RichSelectOneChoice format_type;
    private static String gotFormat = "";
    private RichSelectOneChoice report_type;
    private static String selectedReportType = "";
    private static BigDecimal gotStudent;
    private RichSelectOneChoice stdID;
    private static BigDecimal gotGrade;
    private RichSelectOneChoice gradeID;
    

    public FeeGeneration() {
        System.out.println("Fee Generation Report");
    }
    
    DatabaseConnection dbconnect = new DatabaseConnection();
    OracleReportBean reportBean = new OracleReportBean(dbconnect.getUipReport(), dbconnect.getUportReport(), null);
    

    public void getStdLedgerReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        Number sendStdIDLgr = (Number) actionEvent.getComponent().getAttributes().get("sendStdIDLgr");
//        reportBean.setReportParameter("P_Std_reg_id", sendStdID.toString());
        String sendStdIDLgrCnvrt = sendStdIDLgr.toString();
        int sendStdIDLgrfinal =Integer.parseInt(sendStdIDLgrCnvrt);  
        
        //calling procedure start//
        Connection conn;
        ResultSet rs;
        CallableStatement cstmt = null;
            try {
                conn = DatabaseConnection.getConnection();
                String SQL = "{call P_Std_Lgr(?)}";
                cstmt = conn.prepareCall (SQL);
                cstmt.setInt(1, sendStdIDLgrfinal);
                rs = cstmt.executeQuery();
            }
            catch (SQLException e) {
                System.out.println(e);
            }
        //calling procedure end//
        
        reportBean.setReportURLName("userid=ppss/ppss@orcl&domain=classicdomain&report=C:/PPSS_Reports/STD_Ledger&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }
    

    public void getStdReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        Number sendStdID = (Number) actionEvent.getComponent().getAttributes().get("sendStdID");
        reportBean.setReportParameter("P_Std_reg_id", sendStdID.toString());
        
        reportBean.setReportURLName("userid=ppss/ppss@orcl&domain=classicdomain&report=C:/PPSS_Reports/STD_Fee_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }
    
    public String get_report() {
        // Add event code here...
        gotFormat = (String)this.getFormat_type().getValue();
        selectedReportType = (String) this.getReport_type().getValue();
        gotStudent = (BigDecimal)this.getstdID().getValue();
        gotGrade = (BigDecimal)this.getgradeID().getValue();
        
        
        String url = "";
        if (gotFormat == "") {
            showMessage("Please Select Report Format");
        } else { 
            
            if ( gotStudent  != null) {
                reportBean.setReportParameter("P_Std_reg_id", gotStudent.toString());
            }
            if ( gotGrade  != null) {
                reportBean.setReportParameter("P_Grade_id", gotGrade.toString());
            }
         
            switch (selectedReportType) {
            case "FeeGenerateDetail":

                reportBean.setReportURLName("userid=ppss/ppss@orcl&domain=classicdomain&report=C:/PPSS_Reports/Fee_Generate_Detail_Report&");
                break;

            case "StudentFeeDetail":

                reportBean.setReportURLName("userid=ppss/ppss@orcl&domain=classicdomain&report=C:/PPSS_Reports/STD_Fee_Detail&");
                break;

            default:
                showMessage("Please Select Report Type");
                break;

            }
        
        } 
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        gotFormat); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
        return null;
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

    public void setFormat_type(RichSelectOneChoice format_type) {
        this.format_type = format_type;
    }

    public RichSelectOneChoice getFormat_type() {
        return format_type;
    }

    public void setReport_type(RichSelectOneChoice report_type) {
        this.report_type = report_type;
    }

    public RichSelectOneChoice getReport_type() {
        return report_type;
    }
    public void setstdID(RichSelectOneChoice stdID) {
        this.stdID = stdID;
    }

    public RichSelectOneChoice getstdID() {
        return stdID;
    }
    public void setgradeID(RichSelectOneChoice gradeID) {
        this.gradeID = gradeID;
    }

    public RichSelectOneChoice getgradeID() {
        return gradeID;
    }

}
