package com.cc.vo;

import java.math.BigDecimal;

public class OrderVo {
    private int eoId;
    private String eoUserName;
    private String eoUserAddress;
    private String eoStutsView;//"发货"
    private String eoTypeView;// 货到付款
    public int getEoId() {
        return eoId;
    }
    public void setEoId(int eoId) {
        this.eoId = eoId;
    }
    public String getEoUserName() {
        return eoUserName;
    }
    public void setEoUserName(String eoUserName) {
        this.eoUserName = eoUserName;
    }
    public String getEoUserAddress() {
        return eoUserAddress;
    }
    public void setEoUserAddress(String eoUserAddress) {
        this.eoUserAddress = eoUserAddress;
    }
    public String getEoStutsView() {
        return eoStutsView;
    }
    public void setEoStutsView(String eoStutsView) {
        this.eoStutsView = eoStutsView;
    }
    public String getEoTypeView() {
        return eoTypeView;
    }
    public void setEoTypeView(String eoTypeView) {
        this.eoTypeView = eoTypeView;
    }
    
    
}
