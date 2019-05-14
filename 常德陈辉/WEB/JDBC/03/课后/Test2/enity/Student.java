package ¿Îºó.Test2.enity;

import java.util.Date;






public class Student {
	private int stuid;
	private	String stuint;
	private String stuname;
	private int stuage;
	private String stusex;
	private String stucard;
	private Date stujointime;
	private String studdress;
	private int sclassid;
	public Student() {
		
	}
	public Student(int stuid, String stuint, String stuname, int stuage, String stusex,
			String stucard, Date stujointime, String studdress, int sclassid) {
		super();
		this.stuid=stuid;
		this.stuint = stuint;
		this.stuname = stuname;
		this.stuage = stuage;
		this.stusex = stusex;
		this.stucard = stucard;
		this.stujointime = stujointime;
		this.studdress = studdress;
		this.sclassid = sclassid;
	}
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStuint() {
		return stuint;
	}
	public void setStuint(String stuint) {
		this.stuint = stuint;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public int getStuage() {
		return stuage;
	}
	public void setStuage(int stuage) {
		this.stuage = stuage;
	}
	public String getStusex() {
		return stusex;
	}
	public void setStusex(String stusex) {
		this.stusex = stusex;
	}
	public String getStucard() {
		return stucard;
	}
	public void setStucard(String stucard) {
		this.stucard = stucard;
	}
	public Date getStujointime() {
		return stujointime;
	}
	public void setStujointime(Date stujointime) {
		this.stujointime = stujointime;
	}
	public String getStuddress() {
		return studdress;
	}
	public void setStuddress(String studdress) {
		this.studdress = studdress;
	}
	public int getSclassid() {
		return sclassid;
	}
	public void setSclassid(int sclassid) {
		this.sclassid = sclassid;
	}
	@Override
	public String toString() {
		return "Student [sclassid=" + sclassid + ", stuage=" + stuage
				+ ", stucard=" + stucard + ", studdress=" + studdress
				+ ", stuid=" + stuid + ", stuint=" + stuint + ", stujointime="
				+ stujointime + ", stuname=" + stuname + ", stusex=" + stusex
				+ "]\n";
	}
	
}
