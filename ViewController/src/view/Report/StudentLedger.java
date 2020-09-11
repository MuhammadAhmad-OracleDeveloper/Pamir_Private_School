package view.Report;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;

import view.DatabaseConnection.DatabaseConnection;

public class StudentLedger {
    private RichSelectOneChoice format_type;
    private static String gotFormat = "";
    private RichSelectOneChoice report_type;
    private static String selectedReportType = "";

    public StudentLedger() {
        System.out.println("Student Ledger Report");
    }
    
    DatabaseConnection dbconnect = new DatabaseConnection();
    OracleReportBean reportBean = new OracleReportBean(dbconnect.getUipReport(), dbconnect.getUportReport(), null);

    public String get_report() {
        // Add event code here...
        gotFormat = (String)this.getFormat_type().getValue();
        selectedReportType = (String) this.getReport_type().getValue();
        
        
        
        String url = "";
        if (gotFormat == "") {
            showMessage("Please Select Report Format");
        } else { 
            
    //            if ( gotStudent  != null) {
    //                reportBean.setReportParameter("P_Std_reg_id", gotStudent.toString());
    //            }
           
         
            switch (selectedReportType) {
            case "StdLedger":

                reportBean.setReportURLName("userid=ppss/ppss@orcl&domain=classicdomain&report=C:/PPSS_Reports/Std_Ledger&");
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
}
