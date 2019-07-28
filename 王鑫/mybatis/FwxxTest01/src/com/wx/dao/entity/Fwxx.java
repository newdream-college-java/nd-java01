package com.wx.dao.entity;
import java.util.Date;
public class Fwxx {
	private int fwid;
	private int uid;
	private int jdid;
	private int qxid;
	private int lxid;
	private int shi;
	private int ting;
	private String fwxx;
	private double zj;
	private String title;
	private Date date;
	private char telephone;
	private char concat;
	public int getFwid() {
		return fwid;
	}
	public void setFwid(int fwid) {
		this.fwid = fwid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getJdid() {
		return jdid;
	}
	public void setJdid(int jdid) {
		this.jdid = jdid;
	}
	public int getQxid() {
		return qxid;
	}
	public void setQxid(int qxid) {
		this.qxid = qxid;
	}
	public int getLxid() {
		return lxid;
	}
	public void setLxid(int lxid) {
		this.lxid = lxid;
	}
	public int getShi() {
		return shi;
	}
	public void setShi(int shi) {
		this.shi = shi;
	}
	public int getTing() {
		return ting;
	}
	public void setTing(int ting) {
		this.ting = ting;
	}
	public String getFwxx() {
		return fwxx;
	}
	public void setFwxx(String fwxx) {
		this.fwxx = fwxx;
	}
	public double getZj() {
		return zj;
	}
	public void setZj(double zj) {
		this.zj = zj;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public char getTelephone() {
		return telephone;
	}
	public void setTelephone(char telephone) {
		this.telephone = telephone;
	}
	public char getConcat() {
		return concat;
	}
	public void setConcat(char concat) {
		this.concat = concat;
	}
	@Override
	public String toString() {
		return "Fwxx [fwid=" + fwid + ", uid=" + uid + ", jdid=" + jdid
				+ ", qxid=" + qxid + ", lxid=" + lxid + ", shi=" + shi
				+ ", ting=" + ting + ", fwxx=" + fwxx + ", zj=" + zj
				+ ", title=" + title + ", date=" + date
				+ ", telephone=" + telephone + ", concat=" + concat + "]";
	}
	
}
