package test;
import java.util.*;
import java.sql.*;
public class DBcon11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try(sc;){
			try {
				System.out.println("enter student rollno:");
				int rll=Integer.parseInt(sc.nextLine());
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl", "SYSTEM", "SWAGAT");
				CallableStatement cs=con.prepareCall("{call ?:=RETRIVEDATA1 (?)}");
				cs.registerOutParameter(1, Types.FLOAT);
				cs.setInt(2, rll);
				cs.execute();
				System.out.println("...students percentage...");
				System.out.println("student Rollno:"+rll);
				System.out.println("students percentage:"+cs.getFloat(1));
				cs.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
