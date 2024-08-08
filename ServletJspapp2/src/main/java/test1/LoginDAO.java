package test1;
import java.sql.*;
public class LoginDAO {
	public StudentBEAN sb=null;
	public StudentBEAN login(String un,String ps) {
		try {
			Connection con=DBcon1.getcon();
			PreparedStatement ps1=con.prepareStatement("select * from studentinfo1 where stdnm=? and sdpswd=?");
			ps1.setString(1,un);
			ps1.setString(2, ps);
			ResultSet rs=ps1.executeQuery();
			if(rs.next()) {
				sb=new StudentBEAN();
				sb.setsdname(rs.getString(1));
				sb.setspswd(rs.getString(2));
				sb.setsdmid(rs.getString(3));
				sb.setsdphno(rs.getLong(4));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return sb;
	}
	
}
