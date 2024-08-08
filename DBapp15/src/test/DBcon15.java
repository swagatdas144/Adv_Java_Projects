package test;
import java.sql.*;

public class DBcon15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","system","SWAGAT");
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet rs=st.executeQuery("select * from product1");
		System.out.println("display table data in reverse:");
		System.out.println();
		rs.afterLast();
		while(rs.previous()) {
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getInt(4));
		}
		PreparedStatement ps1=con.prepareStatement("select * from product1",1004,1007);
		ResultSet rs1=ps1.executeQuery();
		rs1.absolute(4);
		System.out.println("...record from row 4:");
		System.out.println();
		System.out.println(rs1.getString(1)+"\t"+rs1.getString(2)+"\t"
		+rs1.getFloat(3)+"\t"+rs1.getInt(4));
		rs1.relative(-2);
		System.out.println("record from row2");
		System.out.println();
		System.out.println(rs1.getString(1)+"\t"+rs1.getString(2)+"\t"
		+rs1.getFloat(3)+"\t"+rs1.getInt(4));

		rs1.beforeFirst();
		System.out.println("display all record:");
		System.out.println();
		while(rs1.next()) {
			System.out.println(rs1.getString(1)+"\t"+rs1.getString(2)+"\t"
					+rs1.getFloat(3)+"\t"+rs1.getInt(4));

		}
		con.close();
		
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}

}
