package test1;
import java.sql.*;
public class RegisterDAO {
	public int k=0;
	public int insert(UserBean ub) {
		try {
			Connection con=DBconnection.getcon();
			PreparedStatement ps=con.prepareStatement("insert into UserRef62 values(?,?,?,?,?,?,?)");
			ps.setString(1,ub.getuname());
			ps.setString(2, ub.getpword());
			ps.setString(3,ub.getfname());
			ps.setString(4, ub.getlname());
			ps.setString(5,ub.getaddr());
			ps.setString(6, ub.getmid());
			ps.setLong(7, ub.getphno());
			k=ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}return k;
	}
}
