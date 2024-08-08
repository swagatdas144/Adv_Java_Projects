package test;
import java.sql.*;
import java.util.*;
public class DBcon10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try(sc;){
			try {
				while(true) {
				System.out.println("enter student rollno:");
				int rlln=Integer.parseInt(sc.nextLine());
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl", "SYSTEM", "SWAGAT");
				CallableStatement cs=con.prepareCall("{call retrivedata(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
				cs.setInt(1, rlln);
				cs.registerOutParameter(2,Types.VARCHAR);
				cs.registerOutParameter(3,Types.VARCHAR);
				cs.registerOutParameter(4,Types.INTEGER);
				cs.registerOutParameter(5,Types.VARCHAR);
				cs.registerOutParameter(6,Types.VARCHAR);
				cs.registerOutParameter(7,Types.VARCHAR);
				cs.registerOutParameter(8,Types.INTEGER);
				cs.registerOutParameter(9,Types.VARCHAR);
				cs.registerOutParameter(10,Types.BIGINT);
				cs.registerOutParameter(11,Types.INTEGER);
				cs.registerOutParameter(12,Types.INTEGER);
				cs.registerOutParameter(13,Types.INTEGER);
				cs.registerOutParameter(14,Types.INTEGER);
				cs.registerOutParameter(15,Types.INTEGER);
				cs.registerOutParameter(16,Types.INTEGER);
				cs.registerOutParameter(17,Types.FLOAT);
				cs.registerOutParameter(18,Types.FLOAT);
				cs.registerOutParameter(19,Types.VARCHAR);
				cs.execute();
				System.out.println("...STUDENTS DETAILS...");
				System.out.println("student rollno:"+rlln);
				System.out.println("student name:"+cs.getString(2));
				System.out.println("student branch:"+cs.getString(3));
				System.out.println("student house no:"+cs.getInt(4));
				System.out.println("student street name:"+cs.getString(5));
				System.out.println("student cityname:"+cs.getString(6));
				System.out.println("student state name:"+cs.getString(7));
				System.out.println("student pincode:"+cs.getInt(8));
				System.out.println("student mailid:"+cs.getString(9));
				System.out.println("student phone no:"+cs.getLong(10));
				System.out.println("student sub1 mark:"+cs.getFloat(11));
				System.out.println("student sub2 mark:"+cs.getFloat(12));
				System.out.println("student sub3 mark:"+cs.getFloat(13));
				System.out.println("student sub4 mark:"+cs.getFloat(14));
				System.out.println("student sub5 mark:"+cs.getFloat(15));
				System.out.println("student sub6 mark:"+cs.getFloat(16));
				System.out.println("student total mark :"+cs.getInt(17));
				System.out.println("student percentage:"+cs.getFloat(18));
				System.out.println("student division:"+cs.getString(19));
				con.close();
				}
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	}

}
