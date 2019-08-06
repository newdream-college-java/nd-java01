package com.dy.entiy;

import java.util.Date;

import org.apache.ibatis.session.SqlSessionFactory;

public class Fwxx {
	private int fwid;//����id
	private int uid;//�û�id
	private int jdid;//�ֵ�id
	private int qxid;//����id
	private int lxid;//��������id
	private int shi;//��id
	private int ting;//��id
	private String fwxx;//������Ϣ
	private String zj;//�ֵ�
	private String title;//����
	private Date date;//��������
	private String telephone;//�绰
	private String concat;//��ϵ��
	
	public Fwxx() {

	}
	public Fwxx(int fwid, int uid, int jdid, int qxid, int lxid, int shi,
			int ting, String fwxx, String zj, String title, Date date,
			String telephone, String concat) {
		super();
		this.fwid = fwid;
		this.uid = uid;
		this.jdid = jdid;
		this.qxid = qxid;
		this.lxid = lxid;
		this.shi = shi;
		this.ting = ting;
		this.fwxx = fwxx;
		this.zj = zj;
		this.title = title;
		this.date = date;
		this.telephone = telephone;
		this.concat = concat;
	}
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
	public String getZj() {
		return zj;
	}
	public void setZj(String zj) {
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
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getConcat() {
		return concat;
	}
	public void setConcat(String concat) {
		this.concat = concat;
	}
	@Override
	public String toString() {
		return "Fwxx [concat=" + concat + ", date=" + date + ", fwid=" + fwid
				+ ", fwxx=" + fwxx + ", jdid=" + jdid + ", lxid=" + lxid
				+ ", qxid=" + qxid + ", shi=" + shi + ", telephone="
				+ telephone + ", ting=" + ting + ", title=" + title + ", uid="
				+ uid + ", zj=" + zj + "]\n";
	}
}
