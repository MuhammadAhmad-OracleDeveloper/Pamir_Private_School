package view.Report;

import java.math.BigDecimal;

import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;

import oracle.jbo.domain.Number;

import view.DatabaseConnection.DatabaseConnection;

public class DiscountPolicy {
    private static BigDecimal gotStudent;
    private static BigDecimal gotGrade;
    private RichSelectOneChoice format_type;
    private RichSelectOneChoice stdID;
    private RichSelectOneChoice gradeID;
    private static String gotFormat = "";

    public DiscountPolicy() {
        System.out.println("Discount Policy Report");
    }

    public String get_report() {
        // Add event code here...
        gotFormat = (String)this.getFormat_type().getValue();
        gotStudent = (BigDecimal)this.getstdID().getValue();
        gotGrade = (BigDecimal)this.getgradeID().getValue();
        
        DatabaseConnection dbconnect = new DatabaseConnection();
        OracleReportBean reportBean = new OracleReportBean(dbconnect.getUipReport(), dbconnect.getUportReport(), null);
       
        
        
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
            
         reportBean.setReportURLName("userid=ppss/ppss@orcl&domain=classicdomain&report=C:/PPSS_Reports/Discount_Policy_Report&");
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
