package test1;
import java.sql.*;
public class DBcon1 {
	private static Connection con=null;
	private DBcon1() {
	}
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(test.dburl,test.us,test.ps);
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	public static Connection getcon() {
		return con;
	}
}
