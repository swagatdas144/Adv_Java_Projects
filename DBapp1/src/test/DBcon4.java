package test;
import java.sql.*;
import java.util.*;
public class DBcon4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(sc;){
			try {
			
				System.out.println("enter book details:");
				System.out.println("enter book code:");
				String bc=sc.nextLine();
				System.out.println("enter book name:");
				String bnm=sc.nextLine();
				System.out.println("enter book authour:");
				String bau=sc.nextLine();
				System.out.println("enter book price:");
				Double bpr=sc.nextDouble();
				System.out.println("Plz enter book quantity:");
				int bqty=sc.nextInt();
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","system", "SWAGAT");
				Statement sm=con.createStatement();
				int k=sm.executeUpdate("insert into bookdetails1 values("+bc+",'"+bnm+"','"+bau+"','"+bpr+"','"+bqty+"')");
				System.out.println("row updated:"+k);
				if(k>0) {
					System.out.println("sucessfully added bookdetails");
				}
				con.close();
			}
			
				catch(SQLIntegrityConstraintViolationException se) {
					System.out.println("book details is already available..");
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}

	}

}
