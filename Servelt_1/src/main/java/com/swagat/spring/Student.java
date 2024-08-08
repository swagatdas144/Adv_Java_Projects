package com.swagat.spring;

public class Student {
	private int sdid;
	private String sdfname;
	private String sdlname;
	public int getSdid() {
		return sdid;
	}
	public void setSdid(int sdid) {
		this.sdid = sdid;
	}
	public String getSdfname() {
		return sdfname;
	}
	public void setSdfname(String sdfname) {
		this.sdfname = sdfname;
	}
	public String getSdlname() {
		return sdlname;
	}
	public void setSdlname(String sdlname) {
		this.sdlname = sdlname;
	}
	
	
	public Student(int sdid) {
		this.sdid = sdid;
	}
	public Student(int sdid, String sdfname, String sdlname) {
		
		this.sdid = sdid;
		this.sdfname = sdfname;
		this.sdlname = sdlname;
	}
	public Student() {
	
	}
	@Override
	public String toString() {
		return "Student [sdid=" + sdid + ", sdfname=" + sdfname + ", sdlname=" + sdlname + "]";
	}
}
