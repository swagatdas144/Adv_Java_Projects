package test;
import java.sql.*;
import java.util.*;
public class DBcon6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try(sc;){
			try {
				System.out.println("enter your book code");
				String Bc=sc.nextLine();
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","system","SWAGAT");
				Statement stm=con.createStatement();
				ResultSet rs=stm.executeQuery("select * from bookdetails1 where BCODE ="+Bc+"");
				if(rs.next()) {
					System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDouble(4)+"\t"+rs.getInt(5));
				}
				else {
					System.out.println("book is not found..");
				}
				con.close();
				
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	}

}
