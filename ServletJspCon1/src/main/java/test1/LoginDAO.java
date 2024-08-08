package test1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import oracle.jdbc.driver.DBConversion;

public class LoginDAO {

	public static UserBean login(String uname, String pass) {
		UserBean ub = null;

		Connection con = DBconnection.getcon();

		try {
			PreparedStatement pstmt = con.prepareStatement("select *from UserRef62 where uname=? and pword=?");

			pstmt.setString(1, uname);
			pstmt.setString(2, pass);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				ub = new UserBean();
				ub.setuname(rs.getString("uname"));
				ub.setfname(rs.getString("fname"));
				ub.setlname(rs.getString("lname"));
				ub.setaddr(rs.getString("addr"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return ub;
		
		
		
	}
}
