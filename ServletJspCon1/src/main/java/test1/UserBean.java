package test1;
import java.io.*;
@SuppressWarnings("serial")
public class UserBean implements Serializable {
	private String Uname,Pword,Fname,Lname,Add,Mid;
	private long Phno;
	public UserBean() {
		
	}
	public String getuname() {
		return Uname;
	}
	public void setuname(String Uname) {
		this.Uname=Uname;
	}
	public String getpword() {
		return Pword;
	}
	public void setpword(String Pword) {
		this.Pword=Pword;
	}
	public String getfname() {
		return Fname;
	}
	public void setfname(String Fname) {
		this.Fname=Fname;
	}
	public String getlname() {
		return Lname;
	}
	public void setlname(String Lname) {
		this.Lname=Lname;
	}
	public String getaddr() {
		return Add;
	}
	public void setaddr(String Add) {
		this.Add=Add;
	}
	public String getmid() {
		return Mid;
	}
	public void setmid(String Mid) {
		this.Mid=Mid;
	}
	public long getphno() {
		return Phno;
	}
	public void setphno(Long string) {
		this.Phno=string;
	}
	
}
