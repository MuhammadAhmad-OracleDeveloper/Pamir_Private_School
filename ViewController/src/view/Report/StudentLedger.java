package view.Report;

import java.math.BigDecimal;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;

import oracle.jbo.ViewObject;

import view.DatabaseConnection.DatabaseConnection;

public class StudentLedger {
    private RichSelectOneChoice format_type;
    private RichSelectOneChoice report_type;
    
    private static String selectedReportType = "";
    private static String gotFormat = "";
    private static String gotStdRegId;

    public StudentLedger() {
        System.out.println("Student Ledger Report");
    }
    
    DatabaseConnection dbconnect = new DatabaseConnection();
    OracleReportBean reportBean = new OracleReportBean(dbconnect.getUipReport(), dbconnect.getUportReport(), null);

    public String get_report() {
        // Add event code here...
        gotFormat = (String)this.getFormat_type().getValue();
        selectedReportType = (String) this.getReport_type().getValue();
//        gotStdRegId = (BigDecimal) this.getGetStdRegId().getValue();
        
        
        
        //get current row value from table//
        DCBindingContainer bindings = this.getDCBindingContainer();
            DCIteratorBinding itorBinding =
           bindings.findIteratorBinding("TblStdRegView1Iterator");//ur iterator name
            RowSetIterator rsi = itorBinding.getRowSetIterator();
            ViewObject ioOrderLines= itorBinding.getViewObject();
            if(itorBinding!= null){
                    Row currentRow = itorBinding.getCurrentRow();
                    if(currentRow != null){
                  gotStdRegId = (currentRow.getAttribute("Id")).toString();//ur column name which u want to fetch
                   System.out.println(gotStdRegId);
                    }}
        //get current row value from table//
            
            
        //working for procedure call//
        String sendStdIDLgrCnvrt = gotStdRegId;
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
        
        
        String url = "";
        if (gotFormat == "") {
            showMessage("Please Select Report Format");
        } else { 
            
                if ( gotStdRegId  != null) {
                    reportBean.setReportParameter("P_Std_reg_id", gotStdRegId.toString());
                }
           
         
            switch (selectedReportType) {
            case "StdLedger":

                reportBean.setReportURLName("userid=ppss/ppss@orcl&domain=classicdomain&report=C:/PPSS_Reports/STD_Ledger&");
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
    
    
    
    
    public DCBindingContainer getDCBindingContainer() {
        DCBindingContainer bindingsContainer =
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry(); 
        return bindingsContainer;
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
}
