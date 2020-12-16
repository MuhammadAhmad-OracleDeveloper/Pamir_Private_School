package view.Report;

import java.math.BigDecimal;

import javax.faces.event.ActionEvent;

import view.DatabaseConnection.DatabaseConnection;

public class VoucherPrint {
    public VoucherPrint() {
    }
    DatabaseConnection dbconnect = new DatabaseConnection();
    OracleReportBean reportBean = new OracleReportBean(dbconnect.getUipReport(), dbconnect.getUportReport(), null);
    

    public void getStdRegReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendStdRegID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendStdRegID");
        reportBean.setReportParameter("P_Std_reg_id", sendStdRegID.toString());
        
        reportBean.setReportURLName("userid=ppss/ppss@orcl&domain=classicdomain&report=C:/PPSS_Reports/Student_Registration_Voucher&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getStaffReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendStaffID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendStaffID");
        reportBean.setReportParameter("P_Staff_id", sendStaffID.toString());
        
        reportBean.setReportURLName("userid=ppss/ppss@orcl&domain=classicdomain&report=C:/PPSS_Reports/Staff_Detail_Voucher&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getEnquiryFollowUpReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendEnqFollowUpID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendEnqFollowUpID");
        reportBean.setReportParameter("P_Enq_Follow_up_id", sendEnqFollowUpID.toString());
        
        reportBean.setReportURLName("userid=ppss/ppss@orcl&domain=classicdomain&report=C:/PPSS_Reports/Enquiry_Follow_Up_Voucher&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getGradeAttReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendGradeAttID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendGradeAttID");
        reportBean.setReportParameter("P_Grade_Att_M_ID", sendGradeAttID.toString());
        
        reportBean.setReportURLName("userid=ppss/ppss@orcl&domain=classicdomain&report=C:/PPSS_Reports/Grade_ATT_Voucher&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getStdEnqReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendStdEnqID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendStdEnqID");
        reportBean.setReportParameter("P_Std_Enq_id", sendStdEnqID.toString());
        
        reportBean.setReportURLName("userid=ppss/ppss@orcl&domain=classicdomain&report=C:/PPSS_Reports/Student_Enquiry_With_Follow_Up_Voucher&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }
}
