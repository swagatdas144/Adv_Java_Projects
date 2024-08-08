package test1;
import java.io.Serializable;
import java.io.*;
@SuppressWarnings("serial")
public class StudentBEAN implements Serializable{
private String sdname,sdpasswd,sdmild;
private long sdphno;
public StudentBEAN() {
	// TODO Auto-generated constructor stub
}
public String getsdname() {
	return sdname;
}
public void setsdname(String sdname) {
	this.sdname=sdname;
}
public String getspswd() {
	return sdpasswd;
}
public void setspswd(String sdpasswd) {
	this.sdpasswd=sdpasswd;
}
public String getsdmid() {
	return sdmild;
}
public void setsdmid(String sdmild) {
	this.sdmild=sdmild;
}
public long getsdphno() {
	return sdphno;
}
public void setsdphno( long sdphno) {
	this.sdphno=sdphno;
}
}

