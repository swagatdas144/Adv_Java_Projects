package test;
import java.sql.*;
import java.util.*;
public class DBcon8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try(sc;){
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","system", "SWAGAT");
				PreparedStatement ps=con.prepareStatement("insert into emp1 values(?,?,?,?,?,?,?)");
				PreparedStatement ps1=con.prepareStatement("select * from emp1");
				PreparedStatement ps2=con.prepareStatement("select * from emp1 where eid=? ");
				PreparedStatement ps3=con.prepareStatement("update emp1 set bsal=?,hra=?,da=?,tsal=? where eid=?");
				PreparedStatement ps4=con.prepareStatement("delete from emp1 where eid=?");
				while(true) {
					try {
					System.out.println("choosse your number....");
					System.out.println("\t1.add epmloyees details:"+"\n2.see all employess details:"+"\n3.view all employees by id:"+"\n4.update employees by id:"+"\n5.delete employees by id:"+"\n6.exit");
					System.out.println("enter your choice:");
					switch(Integer.parseInt(sc.nextLine())) {
					case 1:
						System.out.println("please enter employee details..");
						System.out.println("enter employee id");
						int emid=Integer.parseInt(sc.nextLine());
						System.out.println("enter employe name:");
						String enm=sc.nextLine();
						System.out.println("enter employee designation:");
						String edg=sc.nextLine();
						System.out.println("enter employee basic salary:");
						float ebs=Float.parseFloat(sc.nextLine());
						float hra=(ebs*77)/100 ;
						float da=(ebs*63)/100 ;
						float tsal=(ebs+hra+da);
						ps.setInt(1, emid);
						ps.setString(2, enm);
						ps.setString(3, edg);
						ps.setFloat(4, ebs);
						ps.setFloat(5, hra);
						ps.setFloat(6, da);
						ps.setFloat(7, tsal);
						int k=ps.executeUpdate();
						if(k>0) {
							System.out.println(" row updated:"+k);
							System.out.println("employee details sucessfully added..");
						}
						break;
					case 2:
						System.out.println("employee details:");
						ResultSet rs=ps1.executeQuery();
						while(rs.next()) {
							System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getFloat(4)+"\t"+rs.getFloat(5)+"\t"+rs.getFloat(6)+"\t"+rs.getFloat(7));
						}
						
						break;
					case 3:
						System.out.println("enter employye id for display the employee details");
						int eid1=Integer.parseInt(sc.nextLine());
						ps2.setInt(1, eid1);
						ResultSet rs1=ps2.executeQuery();
						if(rs1.next()) {
							System.out.println(rs1.getInt(1)+"\t"+rs1.getString(2)+"\t"+rs1.getString(3)+"\t"+rs1.getFloat(4)+"\t"+rs1.getFloat(5)+"\t"+rs1.getFloat(6)+"\t"+rs1.getFloat(7));
						
						}else {
							System.out.println("invalid code..");
						}
						
						break;
					case 4:
						System.out.println("update employee by employee id ");
						System.out.println("enter employee id for updating:");
						int eid2=Integer.parseInt(sc.nextLine());
						ps2.setInt(1, eid2);
						ResultSet rs2=ps2.executeQuery();
						if(rs2.next()) {
							System.out.println("old basic salary:"+rs2.getFloat(4));
							System.out.println("new salary:");
							float ebs2=Float.parseFloat(sc.nextLine());
							float hra1=(ebs2*77)/100 ;
							float da1=(ebs2*63)/100 ;
							float tsal1=(ebs2+hra1+da1);
							ps3.setFloat(1, ebs2);
							ps3.setFloat(2, hra1);
							ps3.setFloat(3, da1);
							ps3.setFloat(4, tsal1);
							ps3.setInt(5, eid2);
							int k1=ps3.executeUpdate();
							System.out.println("row updated:"+k1);
							if(k1>0) {
								System.out.println("updated sucessfulyy...");
							}
							
						}
						break;
					case 5:
						System.out.println("delete employee details by id:");
						System.out.println("enter employee id:");
						float eid3=Float.parseFloat(sc.nextLine());
						ps2.setFloat(1, eid3);
						ResultSet rs3=ps2.executeQuery();
						if(rs3.next()) {
							ps4.setFloat(1, eid3);
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
						System.out.println("operation stopped....");
						System.exit(0);
					
					default:
						System.out.println("invalid code ..please enter the given chooseen number...");
					}
				
				
				
				}catch(SQLIntegrityConstraintViolationException se) {
					System.out.println("employee details not available here...please enter another code.." );
				}
				}
			 }catch(Exception e) {
				System.out.println(e.toString());
			 
			 }
				}
			
			}
		}
			
	

			
		
		
			