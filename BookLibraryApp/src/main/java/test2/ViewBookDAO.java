package test2;
import java.sql.*;
import java.util.*;
public class ViewBookDAO {
	public ArrayList<BookBean> al=new ArrayList<BookBean>();
	public ArrayList<BookBean>retrive(){
		try {
			
			Connection con=DBconnection.getcon();
			PreparedStatement ps=con.prepareStatement("select * from Book62");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				BookBean bb=new BookBean();
				bb.setCode(rs.getString(1));
				bb.setName(rs.getString(2));
				bb.setAuthor(rs.getString(3));
				bb.setPrice(rs.getFloat(4));
				bb.setQty(rs.getInt(5));
				al.add(bb);			
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return al;
	}
}
