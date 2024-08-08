package test;
import java.sql.*;
public class DBcon5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","system","SWAGAT");
			Statement sm=con.createStatement();
			ResultSet rs=sm.executeQuery("SELECT * FROM BOOKDETAILS1");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDouble(4)+"\t"+rs.getInt(5));
			}
			con.close();
			}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
