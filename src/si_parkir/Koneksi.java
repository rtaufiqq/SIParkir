/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package si_parkir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Ramadhan Taufiq
 */
public class Koneksi {
    private String dbuser = "root";
    private String dbpasswd = "";
    private String dbname="jdbc:mysql://localhost/siparkir";
    public Statement stmt = null;
    public Connection con = null;
    public ResultSet rs = null;
    
    public Koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("JDBC Driver Eror");
        }
        try {
            con = DriverManager.getConnection(dbname, dbuser, dbpasswd);
            stmt = con.createStatement();
        } catch (Exception e) {
            System.out.println("Connection Error 1");
        }
    }

    public ResultSet getData(String SQLString) {
        try {
            rs = stmt.executeQuery(SQLString);
        } catch (Exception e) {
            System.out.println("Communication Error 2");
        }
        return rs;
    }

    public void query(String SQLString) {
        try {
            stmt.execute(SQLString);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
