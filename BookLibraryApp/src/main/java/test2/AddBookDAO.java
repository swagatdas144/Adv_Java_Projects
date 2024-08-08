package test2;
import java.sql.*;
public class AddBookDAO {
	public int k=0;
	public int insert(BookBean bb) {
		try {
			Connection con=DBconnection.getcon();
			PreparedStatement ps2=con.prepareStatement("insert into Book62 values(?,?,?,?,?)");
			ps2.setString(1,bb.getCode());
			ps2.setString(2,bb.getName());
			ps2.setString(3, bb.getAuthor());
			ps2.setFloat(4,bb.getPrice());
			ps2.setInt(5, bb.getQty());
			k=ps2.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}
	
}
