package com.test.DemoSpring;

public class Students {
	
	
	private int studentid;
	private String studentname;
	private String Studentadd;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentadd() {
		return Studentadd;
	}
	public void setStudentadd(String studentadd) {
		Studentadd = studentadd;
	}
	public Students(int studentid, String studentname, String studentadd) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		Studentadd = studentadd;
	}
	public Students() {
		super();
	}
	@Override
	public String toString() {
		return "Students [studentid=" + studentid + ", studentname=" + studentname + ", Studentadd=" + Studentadd + "]";
	}
	
	
	
	
	
	
	
	/*
	 * public Students() { super(); }
	 * 
	 * public int getStudentid() { return studentid; }
	 * 
	 * public void setStudentid(int studentid) { this.studentid = studentid; }
	 * 
	 * public String getStudentname() { return studentname; } public void
	 * setStudentname(String studentname) { this.studentname = studentname; } public
	 * String getStudentadd() { return studentadd; } public void
	 * setStudentadd(String studentadd) { this.studentadd = studentadd; }
	 * 
	 * 
	 * 
	 * public Students(int studentid, String studentname, String studentadd) {
	 * super(); this.studentid = studentid; this.studentname = studentname;
	 * this.studentadd = studentadd; }
	 * 
	 * @Override public String toString() { return "Students [studentid=" +
	 * studentid + ", studentname=" + studentname + ", studentadd=" + studentadd +
	 * "]"; }
	 */
	


}
