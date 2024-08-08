package test2;
import java.sql.*;

public class UpdateDAO {
	public int k=0;
	public int update(BookBean bb) {
		try {
			Connection con=DBconnection.getcon();
			PreparedStatement ps=con.prepareStatement("update Book62 set bprice=?,bqty=? where bcode=?");
			ps.setFloat(1,bb.getPrice());
			ps.setInt(2, bb.getQty());
			ps.setString(3, bb.getCode());
			k=ps.executeUpdate();
			}catch(Exception e) {
			e.printStackTrace();
		}
		
		return k;
		
	}
}
