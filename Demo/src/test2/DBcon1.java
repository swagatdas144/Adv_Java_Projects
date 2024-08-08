package test2;
import java.sql.*;
public class DBcon1 {
	public static void main(String[] args) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","SYSTEM","SWAGAT");
				
		Statement stm=con.createStatement();
		ResultSet rs=stm.executeQuery("SELECT * FROM CUSTOMER1");
		//System.out.println("CUSTOMER DETAILS");
		while(rs.next()) {
			System.out.println(rs.getLong(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
		}
		con.close();
	}
	catch(Exception e) {
		System.out.println(e.toString());
		//e.printStackTrace();
	}
	}
}
