package com.dy.entiy;

public class OrderCustom extends Orders{
	private String userName;
	private String sex;
	@Override
	public String toString() {
		return "OrderCustom [userName=" + userName + ", sex=" + sex
				+ ", getId()=" + getId() + ", getUser_id()=" + getUser_id()
				+ ", getNumber()=" + getNumber() + ", getCreatetime()="
				+ getCreatetime() + "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
