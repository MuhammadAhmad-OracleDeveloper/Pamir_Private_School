package view.Report;
//
//public class OracleReportBean {
//}


import java.util.HashMap;
import java.util.Iterator;

import javax.faces.context.FacesContext;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;


/***
 * This bean performs the following functions:
 * Constructing the Report URL with various parameters passed in by client.
 * Sending the report request.
 * Execute printed report and retrieve return status in the indicated format.
 * Execute a binary report (PDF, RTF, XML, with DESTYPE CACHE) and return the
 * InputStream for processing.
 */
public class OracleReportBean {

    /* Report Servlet Host Settings */
    private String http_host = null;
    private String http_port = null;

    /* Default path as per generic Oracle Appserver install */
    private String servlet_path = "/reports/rwservlet";

    /* Report Servlet URL params */
    public static final String RS_PARAM_SERVER = "server";
    public static final String RS_PARAM_USERID = "userid";
    public static final String RS_PARAM_REPORT = "report";
    public static final String RS_PARAM_ENVID = "envid";
    public static final String RS_PARAM_DESTYPE = "destype";
    public static final String RS_PARAM_DESFORMAT = "desformat";
    public static final String RS_PARAM_STATUSFORMAT = "statusformat";
    public static final String RS_PARAM_DESNAME = "desname";
    public static final String RS_PARAM_PAGESTREAM = "pagestream";
    public static final String RS_PARAM_DELIMITER = "delimiter";
    public static final String RS_PARAM_ORIENTATION = "orientation";
    public static final String RS_PARAM_DISTRIBUTE = "distribute";
    public static final String RS_PARAM_FILETYPE = "FILETYPE";
    public static final String RS_PARAM_REP_VA = "REP_VA";


    private String value_keyMap = null;

    /* Static values for destination formats */
    public static final String DESFORMAT_PDF = "PDF";
    public static final String DESFORMAT_HTML = "HTML";
    public static final String DESFORMAT_POSTSCRIPT = "POSTSCRIPT";
    public static final String DESFORMAT_DELIMITED = "DELIMITED";
    public static final String DESFORMAT_XML = "XML";
    public static final String DESFORMAT_RTF = "RTF";

    /* Static values for destination types*/
    public static final String DESTYPE_MAIL = "mail";
    public static final String DESTYPE_PRINTER = "printer";
    public static final String DESTYPE_FILE = "file";
    public static final String DESTYPE_LOCAL_FILE = "localFile";
    public static final String DESTYPE_CACHE = "cache";

    /* Static values for distribute */
    public static final String DISTRIBUTE_YES = "YES";
    public static final String DISTRIBUTE_NO = "NO";

    /*Static values for status format */
    public static final String STATUSFORMAT_XML = "XML";
    public static final String STATUSFORMAT_HTML = "HTML";

    /* Static values for report orientation */
    public static final String ORIENTATION_PORTRAIT = "PORTRAIT";
    public static final String ORIENTATION_LANDSCAPE = "LANDSCAPE";
    public static final String ORIENTATION_DEFAULT = "DEFAULT";

    public static String ReportParamURL = "";
    
    /* HashMap to hold individual report parameters*/
    private HashMap reportParams = new HashMap();

    /* HashMap to hold report server params */
    private HashMap reportServerParams = new HashMap();

    /* Report Servlet */
    private StringBuffer reportURL = new StringBuffer();
    // private String XMLReturnStatus = null;


    /***
     * Constructor
     */
    public OracleReportBean(String p_http_host, String p_http_port, String p_servlet_path) {
        http_host = p_http_host;
        http_port = p_http_port;

        /* If the servlet path is null, we assign the default path. */
        if (p_servlet_path != null) {
            servlet_path = p_servlet_path;
        }

        /* Default the status format to XML
setReportServerParam(RS_PARAM_STATUSFORMAT,STATUSFORMAT_XML);*/

    }


    /*****
     * Private utility methods ...
     *
     */
    private String buildKeyValueString(HashMap p_map) {

        String map_key = null;
        String param_sep = "&";
        String param_equal = "=";
        StringBuffer keyValueBuffer = new StringBuffer();

        if (!p_map.isEmpty()) {

            Iterator mapKeys = p_map.keySet().iterator();

            while (mapKeys.hasNext()) {
                map_key = (String) mapKeys.next();
                keyValueBuffer.append(map_key).append(param_equal).append(p_map.get(map_key));

                if (mapKeys.hasNext()) {
                    keyValueBuffer.append(param_sep);
                }
            }
        }
        return keyValueBuffer.toString();
    }

    /* Construct the URL for accessing the Oracle Reports Servlet */

    private void constructURL() {
        String param_sep = "&";

        /* Clearout current URL */
        reportURL = new StringBuffer();

        /* HOST Section */

        reportURL.append("http://");
        reportURL.append(http_host);
        
        if (http_port != null) {
            reportURL.append(":").append(http_port);
        }

        /* Add "/" separator if necessary. */
        if (servlet_path.indexOf("/") > 0) {
            reportURL.append("/");
        }

        reportURL.append(servlet_path);
        reportURL.append("?");
        
     //   reportURL.append("userid=ir19/ir19@orcl&domain=classicdomain&report=C:/ERP/ir19/REPORTS/ReportsGl/SALE_INVOICE&");
        reportURL.append(ReportParamURL);

        if (value_keyMap != null) {
            reportURL.append(value_keyMap).append(param_sep);
        }

        /*Construct Report Server Parameter URL component*/
        reportURL.append(buildKeyValueString(reportServerParams));

        if (!reportServerParams.isEmpty()) {
            reportURL.append(param_sep);
        }

        /*Construct Report Parameters URL Component*/
    reportURL.append(buildKeyValueString(reportParams));
    }

    /***
     * Getters and Setters for the Reports Servlet
     * URL parameter values.
     */

    public void setReportServerParam(String p_param, String p_value) {
        reportServerParams.put(p_param, p_value);
    }

    public String getReportServerParam(String p_param) {
        if (reportServerParams.containsKey(p_param)) {
            return (String) reportServerParams.get(p_param);
        } else {
            return null;
        }
    }

    /* Set/Get the value of a Reports KeyMap file */

    public void setKeyMap(String p_keyMap) {
        value_keyMap = p_keyMap;
    }

    public String getKeyMap() {
        return value_keyMap;
    }

    /* Add/Update and retrieve individual report parameters */

    public void setReportURLName(String ReportURLName) {

        ReportParamURL = ReportURLName;
    }

    public void setReportParameter(String paramName, String paramValue) {

        reportParams.put(paramName, paramValue);
    }

    public String getReportParameter(String paramName) {

        if (reportParams.containsKey(paramName)) {
            return (String) reportParams.get(paramName);
        } else {
            return null;
        }

    }

    /****
     * Construct and return a URL that can be used to execute the report.
     */
    public String getReportServerURL() {
        constructURL();
        return reportURL.toString();
    }

    public void openUrlInNewWindow(String url) {
        ExtendedRenderKitService erks =
            Service.getRenderKitService(FacesContext.getCurrentInstance(), ExtendedRenderKitService.class);
        StringBuilder strb = new StringBuilder("window.open('" + url + "');");
        erks.addScript(FacesContext.getCurrentInstance(), strb.toString());
    }
}
