package com.nareshit.spring;

public class Student {
	private String sfname;
	private String slname;
	private long sphno;
	public String getSfname() {
		return sfname;
	}
	public void setSfname(String sfname) {
		this.sfname = sfname;
	}
	public String getSlname() {
		return slname;
	}
	public void setSlname(String slname) {
		this.slname = slname;
	}
	public long getSphno() {
		return sphno;
	}
	public void setSphno(long sphno) {
		this.sphno = sphno;
	}
	public Student(String sfname, String slname, long sphno) {
		super();
		this.sfname = sfname;
		this.slname = slname;
		this.sphno = sphno;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [sfname=" + sfname + ", slname=" + slname + ", sphno=" + sphno + "]";
	}
	
}
