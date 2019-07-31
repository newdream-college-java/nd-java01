package com.yb.entity;

public class Fwlx {
    private Integer lxid;

    private String fwlx;

    public Integer getLxid() {
        return lxid;
    }

    public void setLxid(Integer lxid) {
        this.lxid = lxid;
    }

    public String getFwlx() {
        return fwlx;
    }

    public void setFwlx(String fwlx) {
        this.fwlx = fwlx == null ? null : fwlx.trim();
    }
}