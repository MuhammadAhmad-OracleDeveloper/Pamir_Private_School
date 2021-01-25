
package view.DatabaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class DatabaseConnection {
    public DatabaseConnection() {
        super();
    }
    public static String uNamee;    
    public static String upasss;    
    public static String uipp;    
    public static String uportADF ;     
    public static String uSID;    
    public static String uportReport;
    public static String uipReport;
    
    public static Connection getConnection() throws SQLException {
        
        /* Database credentials >> username , password , hostname , port , SID  */
        setUNamee("ppss");
        setUpasss("ppss");
//        setUipp("207.180.246.67");
        setUipp("192.168.2.2");
        setUportADF("1521");
        setUSID("orcl");
        /* END  */
        
        /*  Report servlet connection >> port , hostname */
        setUportReport("9002");
        setUipReport("207.180.246.67");
        /*  END */
        
        String thinConn = "jdbc:oracle:thin:@" + getUipp() + ":" + getUportADF() + ":" + getUSID() ;
        DriverManager.registerDriver(new OracleDriver());
        Connection conn = DriverManager.getConnection(thinConn, uNamee, upasss);
        conn.setAutoCommit(false);
        return conn;
    }
    
    public static String getuNamee(){
        return uNamee;
    }

    public static void setUNamee(String uNamee) {
        DatabaseConnection.uNamee = uNamee;
    }

    public static void setUpasss(String upasss) {
        DatabaseConnection.upasss = upasss;
    }

    public static String getUpasss() {
        return upasss;
    }

    public static void setUipp(String uipp) {
        DatabaseConnection.uipp = uipp;
    }

    public static String getUipp() {
        return uipp;
    }

    public static void setUportADF(String uportADF) {
        DatabaseConnection.uportADF = uportADF;
    }

    public static String getUportADF() {
        return uportADF;
    }

    public static void setUSID(String uSID) {
        DatabaseConnection.uSID = uSID;
    }

    public static String getUSID() {
        return uSID;
    }

    public static void setUportReport(String uportReport) {
        DatabaseConnection.uportReport = uportReport;
    }

    public static String getUportReport() {
        return uportReport;
    }

    public static void setUipReport(String uipReport) {
        DatabaseConnection.uipReport = uipReport;
    }

    public static String getUipReport() {
        return uipReport;
    }
}
