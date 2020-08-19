package view.Report;

import java.math.BigDecimal;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;

import view.DatabaseConnection.DatabaseConnection;

public class StaffDetail {
    private RichSelectOneChoice format_type;
    private static String gotFormat = "";
    private RichSelectOneChoice report_type;
    private static String selectedReportType = "";
    private static BigDecimal gotstaff;
    private RichSelectOneChoice staffID;

    public StaffDetail() {
        System.out.println("Staff Detail Report");
    }

    public String get_report() {
        // Add event code here...
        gotFormat = (String) this.getFormat_type().getValue();
        selectedReportType = (String) this.getReport_type().getValue();
        gotstaff = (BigDecimal)this.getstaffID().getValue();

        DatabaseConnection dbconnect = new DatabaseConnection();
        OracleReportBean reportBean = new OracleReportBean(dbconnect.getUipReport(), dbconnect.getUportReport(), null);
        String url = "";
        if (gotFormat == "") {
            showMessage("Please Select Report Format");
        } else {
            
            if ( gotstaff  != null) {
                reportBean.setReportParameter("P_Staff_id", gotstaff.toString());
            }

            switch (selectedReportType) {
            case "MiscellaneousDocumentsDetailReport":

                reportBean.setReportURLName("userid=ppss/ppss@orcl&domain=classicdomain&report=C:/PPSS_Reports/Miscellaneous_Documents_Detail_Report&");
                break;
            
            case "PassportExpiryDetailReport":

                reportBean.setReportURLName("userid=ppss/ppss@orcl&domain=classicdomain&report=C:/PPSS_Reports/Passport_Expiry_Detail_Report&");
                break;

            case "VisaExpiryDetailReport":

                reportBean.setReportURLName("userid=ppss/ppss@orcl&domain=classicdomain&report=C:/PPSS_Reports/Visa_Expiry_Detail_Report&");
                break;

            case "StaffDetailReport":

                reportBean.setReportURLName("userid=ppss/ppss@orcl&domain=classicdomain&report=C:/PPSS_Reports/Staff_Detail_Report&");
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

    public void setstaffID(RichSelectOneChoice staffID) {
        this.staffID = staffID;
    }

    public RichSelectOneChoice getstaffID() {
        return staffID;
    }
}
