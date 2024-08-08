package test;
import java.sql.*;
import java.util.*;

public class DBcon14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		try(s;){
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","system","SWAGAT");
				PreparedStatement ps1=con.prepareStatement("select * from bank3 where accno=?");
				PreparedStatement ps2=con.prepareStatement("update bank3 set bal=bal+? where accno=?");
				boolean b=con.getAutoCommit();
				System.out.println("commit status:"+b);
				con.setAutoCommit(false);
				System.out.println("commit status:"+con.getAutoCommit());
				Savepoint sp=con.setSavepoint();
				System.out.println("enter the Home account No:");
				long hacno=s.nextLong();
				ps1.setLong(1, hacno);
				ResultSet rs1=ps1.executeQuery();
				if(rs1.next()) {
					float bl=rs1.getFloat(3);
					System.out.println("enter the banificery accno:");
					long bacno=s.nextLong();
					ps1.setLong(1, bacno);
					ResultSet rs2=ps1.executeQuery();
					if(rs2.next()) {
						System.out.println("enter the amount to be transfered: ");
						float amt=s.nextFloat();
						if(amt<=bl) {
							ps2.setFloat(1, -amt);
							ps2.setLong(2, hacno);
							int p=ps2.executeUpdate();
							ps2.setFloat(1, +amt);
							ps2.setLong(2, bacno);
							int k=ps2.executeUpdate();
							if(p==1&&k==1 ) {
								System.out.println("transaction successfull..");
								con.commit();
							}else {
								System.out.println("transaction failed..");
								con.rollback(sp);
							}
						}else {
							System.out.println("insufficient fund...");
						}
						
					}else {
						System.out.println("invalid account number ..");
					}
				}else {
					System.out.println("invalid account number .. ");
				}
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	}

}
