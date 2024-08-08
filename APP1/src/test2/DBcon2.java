package test2;
import java.sql.*;
import java.util.*;
public class DBcon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try(sc;){
			try {
				System.out.println("enter your phone number:");
				long ph=Long.parseLong(sc.nextLine());
				System.out.println("enter your name");
				String cnm=sc.nextLine();
				System.out.println("enter your city");
				String city=sc.nextLine();
				System.out.println("enter your emailid");
				String cid=sc.nextLine();
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","system","SWAGAT");
				Statement stm=con.createStatement();
				int k=stm.executeUpdate("insert into customer1 values("+ph+",'"+cnm+"','"+city+"','"+cid+"')");
				System.out.println("updated row:"+k);
				if(k>0) {
					System.out.println("cusmoer is already added sucessfully...");
				}
				con.close();
			}
			catch(SQLIntegrityConstraintViolationException se) {
				System.out.println("customer is available..");
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	}
}
					
			

