package com.cc.entity;

import java.util.Date;

public class Fwxx {
    private Integer fwid;

    private Integer uid;

    private Integer jdid;

    private Integer qxid;

    private Integer lxid;

    private Integer shi;

    private Integer ting;

    private String fwxx;

    private Long zj;

    private String title;

    private Date date;

    private String telephone;

    private String concat;

    public Integer getFwid() {
        return fwid;
    }

    public void setFwid(Integer fwid) {
        this.fwid = fwid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getJdid() {
        return jdid;
    }

    public void setJdid(Integer jdid) {
        this.jdid = jdid;
    }

    public Integer getQxid() {
        return qxid;
    }

    public void setQxid(Integer qxid) {
        this.qxid = qxid;
    }

    public Integer getLxid() {
        return lxid;
    }

    public void setLxid(Integer lxid) {
        this.lxid = lxid;
    }

    public Integer getShi() {
        return shi;
    }

    public void setShi(Integer shi) {
        this.shi = shi;
    }

    public Integer getTing() {
        return ting;
    }

    public void setTing(Integer ting) {
        this.ting = ting;
    }

    public String getFwxx() {
        return fwxx;
    }

    public void setFwxx(String fwxx) {
        this.fwxx = fwxx == null ? null : fwxx.trim();
    }

    public Long getZj() {
        return zj;
    }

    public void setZj(Long zj) {
        this.zj = zj;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getConcat() {
        return concat;
    }

    public void setConcat(String concat) {
        this.concat = concat == null ? null : concat.trim();
    }

	@Override
	public String toString() {
		return "Fwxx [fwid=" + fwid + ", uid=" + uid + ", jdid=" + jdid
				+ ", qxid=" + qxid + ", lxid=" + lxid + ", shi=" + shi
				+ ", ting=" + ting + ", fwxx=" + fwxx + ", zj=" + zj
				+ ", title=" + title + ", date=" + date + ", telephone="
				+ telephone + ", concat=" + concat + "]";
	}
    
}