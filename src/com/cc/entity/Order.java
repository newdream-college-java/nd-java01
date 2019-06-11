package com.cc.entity;

import java.math.BigDecimal;

public class Order {
    private int eoId;
    private String eoUserName;
    private int eoUserId;
    private String eoUserAddress;
    private String eoCreateTime;
    private BigDecimal eoCost;
    private int eoStatus;//1
    private int eoType;//1
    
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
    public int getEoUserId() {
        return eoUserId;
    }
    public void setEoUserId(int eoUserId) {
        this.eoUserId = eoUserId;
    }
    public String getEoUserAddress() {
        return eoUserAddress;
    }
    public void setEoUserAddress(String eoUserAddress) {
        this.eoUserAddress = eoUserAddress;
    }
    public String getEoCreateTime() {
        return eoCreateTime;
    }
    public void setEoCreateTime(String eoCreateTime) {
        this.eoCreateTime = eoCreateTime;
    }
    public BigDecimal getEoCost() {
        return eoCost;
    }
    public void setEoCost(BigDecimal eoCost) {
        this.eoCost = eoCost;
    }
    public int getEoStatus() {
        return eoStatus;
    }
    public void setEoStatus(int eoStatus) {
        this.eoStatus = eoStatus;
    }
    public int getEoType() {
        return eoType;
    }
    public void setEoType(int eoType) {
        this.eoType = eoType;
    }
    public Order(int eoId, String eoUserName, int eoUserId, String eoUserAddress, String eoCreateTime,
            BigDecimal eoCost, int eoStatus, int eoType) {
        super();
        this.eoId = eoId;
        this.eoUserName = eoUserName;
        this.eoUserId = eoUserId;
        this.eoUserAddress = eoUserAddress;
        this.eoCreateTime = eoCreateTime;
        this.eoCost = eoCost;
        this.eoStatus = eoStatus;
        this.eoType = eoType;
    }
    @Override
    public String toString() {
        return "Order [eoId=" + eoId + ", eoUserName=" + eoUserName + ", eoUserId=" + eoUserId + ", eoUserAddress="
                + eoUserAddress + ", eoCreateTime=" + eoCreateTime + ", eoCost=" + eoCost + ", eoStatus=" + eoStatus
                + ", eoType=" + eoType + "]";
    }
    
    public Order() {
        super();
        // TODO Auto-generated constructor stub
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
