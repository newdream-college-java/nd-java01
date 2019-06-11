package com.cc.entity;

public class News {
    private int enId;
    private String enTitle;
    private String enContent;
    private String enCreateTime;
    public int getEnId() {
        return enId;
    }
    public void setEnId(int enId) {
        this.enId = enId;
    }
    public String getEnTitle() {
        return enTitle;
    }
    public void setEnTitle(String enTitle) {
        this.enTitle = enTitle;
    }
    public String getEnContent() {
        return enContent;
    }
    public void setEnContent(String enContent) {
        this.enContent = enContent;
    }
    public String getEnCreateTime() {
        return enCreateTime;
    }
    public void setEnCreateTime(String enCreateTime) {
        this.enCreateTime = enCreateTime;
    }
    public News(int enId, String enTitle, String enContent, String enCreateTime) {
        super();
        this.enId = enId;
        this.enTitle = enTitle;
        this.enContent = enContent;
        this.enCreateTime = enCreateTime;
    }
    public News() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "News [enId=" + enId + ", enTitle=" + enTitle + ", enContent=" + enContent + ", enCreateTime="
                + enCreateTime + "]";
    }
    
}
