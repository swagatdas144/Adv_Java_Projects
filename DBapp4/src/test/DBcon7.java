package test;
import java.sql.*;
import java.util.*;
public class DBcon7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try(sc;){
			try {
		
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","system","SWAGAT");
				PreparedStatement ps=con.prepareStatement("insert into product1 values(?,?,?,?)");
				PreparedStatement ps1=con.prepareStatement("select * from product1");
				PreparedStatement ps2=con.prepareStatement("select * from product1 where pcode=?");
				PreparedStatement ps3=con.prepareStatement("update product1 set pprice=?,pqty=? where pcode=?");
				PreparedStatement ps4=con.prepareStatement("delete from product1 where pcode=?");
				while(true) {
					try {
					System.out.println("...choose a  number for ..");
					System.out.println("\t1.Add product"+"\n2.View all products"+"\n3.view all product by code"+"\n4.update product by code(price,qnty)"+"\n5.delete all product details by code"+"\n6.exit");
					System.out.println("enter your choice:");
					switch(Integer.parseInt(sc.nextLine())) {
					case 1:
						System.out.println("enter product details..");
						System.out.println("enter product code");
						String pcd=sc.nextLine();
						System.out.println("enter product name:. ");
						String pnm=sc.nextLine();
						System.out.println("enter product price..");
						float ppr=Float.parseFloat(sc.nextLine());
						System.out.println("enter product quantity..");
						int pqty=Integer.parseInt(sc.nextLine());
						ps.setString(1, pcd);
						ps.setString(2, pnm);
						ps.setFloat(3, ppr);
						ps.setInt(4, pqty);
						int k=ps.executeUpdate();
						System.out.println("row updated:"+k);
						if(k>0) {
							System.out.println("product updated sucessfully..");
						}
						break;
					case 2:
						ResultSet rs=ps1.executeQuery();
						System.out.println("product details..");
						while(rs.next()) {
							System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getInt(4));
						}
						break;
					case 3:
						System.out.println("view all product by chose product code:");
						String pco=sc.nextLine();
						ps2.setString(1, pco);
						ResultSet rs1=ps2.executeQuery();
						if(rs1.next()) {
							System.out.println(rs1.getString(1)+"\t"+rs1.getString(2)+"\t"+rs1.getFloat(3)+"\t"+rs1.getInt(4));
							
						}else {
							System.out.println("product is not available..");
						}
						
						break;
					case 4:
						System.out.println("update product by code for set price and quantity");
						String pco1=sc.nextLine();
						ps2.setString(1, pco1);
						ResultSet rs2=ps2.executeQuery();
						if(rs2.next()) {
							System.out.println("old product price:"+rs2.getFloat(3));
							System.out.println("enter new price:");
							float ppr1=Float.parseFloat(sc.nextLine());
							System.out.println("old product quantity:"+rs2.getInt(4));
							System.out.println("enter new product quantity");
							int pqty1=Integer.parseInt(sc.nextLine());
							ps3.setFloat(1, ppr1);
							ps3.setInt(2, pqty1);
							ps3.setString(3, pco1);
							int k1=ps3.executeUpdate();
							if(k1>0) {
								System.out.println("sucessfully updated product ");
							}
							
							}else {
								System.out.println("invalid code...");
						}
						break;
					case 5:
						System.out.println("delete product details by using the code..");
						System.out.println("enter the product code:");
						String pco2=sc.nextLine();
						ps2.setString(1, pco2);
						ResultSet rs3=ps2.executeQuery();
						if(rs3.next()) {
							ps4.setString(1, pco2);
							int k2=ps4.executeUpdate();
							System.out.println("row deleted:"+k2);
							if(k2>0) {
								System.out.println("product deleted sucessfully..");
							}else {
								System.out.println("invalid code..");
							}
						}
						break;
					case 6:
						System.out.println("opperation stopped....");
						System.exit(0);
					default:
						System.out.println("invalid choice number..");
					}
					
					}catch(SQLIntegrityConstraintViolationException se) {
						System.out.println("product already available");
					}
				}
					
				
				}catch(Exception e) {
				System.out.println(e.toString());
			}
		
		}
		
	}
	

}