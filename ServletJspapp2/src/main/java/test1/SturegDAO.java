package test1;
import java.sql.*;
public class SturegDAO {
	public int k=0;
	public int insert(StudentBEAN sb) {
		try {
			Connection con=DBcon1.getcon();
			PreparedStatement ps=con.prepareStatement("insert into studentinfo1 values(?,?,?,?)");
			ps.setString(1,sb.getsdname() );
			ps.setString(2, sb.getspswd());
			ps.setString(3, sb.getsdmid());
			ps.setLong(4, sb.getsdphno());
			k=ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}
