package test2;
import java.sql.*;
public class DBconnection {
	private  static Connection con=null;
	private DBconnection() {}
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(DBinfo.dburl,DBinfo.uName,DBinfo.pWord);
		}catch(Exception e) {
			e.printStackTrace();
		 }
		} public static Connection getcon() {
			return con;
	}
		
}
