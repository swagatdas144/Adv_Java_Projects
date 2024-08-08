package test;
import java.sql.*;
import java.util.*;
public class DBcon9 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try(sc;){
			try {
				System.out.println("enter student rollno: ");
				int sdrl=Integer.parseInt(sc.nextLine());
				System.out.println("enter student name: ");
				String snm=sc.nextLine();
				System.out.println("enter student branch: ");
				String sdbrc=sc.nextLine();
				System.out.println("enter student houseno: ");
				int sdhn=Integer.parseInt(sc.nextLine());
				System.out.println("enter student street name: ");
				String strnm=sc.nextLine();
				System.out.println("enter student city name: ");
				String cty=sc.nextLine();
				System.out.println("enter student state name: ");
				String stat=sc.nextLine();
				System.out.println("enter student pincode: ");
				int pncd=Integer.parseInt(sc.nextLine());
				System.out.println("enter student mailid name: ");
				String mlid=sc.nextLine();
				System.out.println("enter student phone no: ");
				long phno=Long.parseLong(sc.nextLine());
				System.out.println("enter s1 mark:");
				int s1=Integer.parseInt(sc.nextLine());
				System.out.println("enter s2 mark:");
				int s2=Integer.parseInt(sc.nextLine());
				System.out.println("enter s3 mark:");
				int s3=Integer.parseInt(sc.nextLine());
				System.out.println("enter s4 mark:");
				int s4=Integer.parseInt(sc.nextLine());
				System.out.println("enter s5 mark:");
				int s5=Integer.parseInt(sc.nextLine());
				System.out.println("enter s6 mark:");
				int s6=Integer.parseInt(sc.nextLine());
				int ttlmrk=s1+s2+s3+s4+s5+s6;
				float per=(ttlmrk*100)/600 ;
				System.out.println("enter student division:");
				String res=sc.nextLine();
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","system", "SWAGAT");
				CallableStatement cs=con.prepareCall("{call STUDENTINFO(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
				if(s1>0 && s2>0 && s3>0 && s4>0 && s5>0 && s6>0 && ttlmrk>0 && per>0) {
					cs.setInt(1,sdrl );
					cs.setString(2,snm);
					cs.setString(3,sdbrc);
					cs.setInt(4, sdhn);
					cs.setString(5, strnm);
					cs.setString(6, cty);
					cs.setString(7, stat);
					cs.setInt(8,pncd );
					cs.setString(9, mlid);
					cs.setLong(10,phno);
					cs.setInt(11, s1);
					cs.setInt(12, s2);
					cs.setInt(13, s3);
					cs.setInt(14, s4);
					cs.setInt(15, s5);
					cs.setInt(16, s6);
					cs.setInt(17, ttlmrk);
					cs.setFloat(18, per);
					cs.setString(19, res);
				}else {
					System.out.println("please enter positive number....");
				}
				cs.execute();
				System.out.println("procedure executed successfully");
				con.close();
				
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	}

}
