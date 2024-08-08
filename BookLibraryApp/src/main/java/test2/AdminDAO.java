package test2;
import java.sql.*;
public class AdminDAO {
	public AdminBean ab=null;
	public AdminBean login(String un,String ps) {
				try {	
				Connection con=DBconnection.getcon();
				PreparedStatement ps1=con.prepareStatement("select * from Admin62 where uname=? and pword=?");
				ps1.setString(1, un);
				ps1.setString(2, ps);
				ResultSet rs=ps1.executeQuery();
				if(rs.next()) {
					ab=new AdminBean();
					ab.setUname(rs.getString(1));
					ab.setPword(rs.getString(2));
					ab.setFname(rs.getString(3));
					ab.setLname(rs.getString(4));
					ab.setAddr(rs.getString(5));
					ab.setMid(rs.getString(6));
					ab.setPhno(rs.getLong(7));
				}
				}catch(Exception e) {
					e.printStackTrace();
				}
	return ab;	
	}	
}
