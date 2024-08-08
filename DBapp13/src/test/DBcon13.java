package test;
import java.sql.*;
import java.util.*;
import java.io.*;

public class DBcon13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		try(s;){
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","system","SWAGAT");
				System.out.println("enter the id to retrive images from database:");
				String id=s.nextLine();
				PreparedStatement ps=con.prepareStatement("select * from StreamTab1 where id=?");
				ps.setString(1, id);
				ResultSet rs=ps.executeQuery();
				if(rs.next()) {
					Blob b=rs.getBlob(2);
					byte by[]=b.getBytes(1, (int)b.length());
					System.out.println("enter the filepath to stored:");
					File f=new File(s.nextLine());
					FileOutputStream fs=new  FileOutputStream(f);
					fs.write(by);
					System.out.println("file received..");
					fs.close();	
					
				}else {
					System.out.println("invalid id");
				}
				con.close();
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	}

}
