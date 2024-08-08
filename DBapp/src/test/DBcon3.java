package test;
import java.sql.*;
import java.util.*;
public class DBcon3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try(sc;){
			try {
				System.out.println("enter your phone number:");
				long ph=sc.nextLong();
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","system","SWAGAT");
				Statement stm=con.createStatement();
				ResultSet rs=stm.executeQuery("select * from customer1 where phno="+ph+"");
				//System.out.println("CUSTOMER DETAILS");
				if(rs.next()) {
					System.out.println(rs.getLong(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
				}else {
					System.out.println("not availvle");
				}
				con.close();
			}catch(Exception e) {
				System.out.println(e.toString());
			}
			
		}
	}
}
				