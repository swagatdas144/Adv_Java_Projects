package test;
import java.sql.*;
import java.util.*;
import java.io.*;

public class DBcon12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		try(s;){
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","system","SWAGAT");
				System.out.println("enter the id to store the image:");
				String id=s.nextLine();
				System.out.println("enter the file path and source:");
				File f=new File(s.nextLine());
				if(f.exists())	{
					FileInputStream fs=new FileInputStream(f);
					PreparedStatement ps=con.prepareStatement("insert into StreamTab1 values(?,?)");
					ps.setString(1, id);
					ps.setBinaryStream(2, fs,f.length());
					int k=ps.executeUpdate();
					if(k>0) {
						System.out.println("file stored to database sucessfully..");
					}else {
						System.out.println("invalid id please enter valid id..");
						
					}
					con.close();
				}
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
		
	}

}
