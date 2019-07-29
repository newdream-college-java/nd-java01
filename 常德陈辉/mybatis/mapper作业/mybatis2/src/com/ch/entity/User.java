package com.ch.entity;

import java.util.Date;

public class User {
	private int id;
	private String username;
	private Date birthday;
	private int sex;
	private String address;
	public User() {
	
	}
	public User(int id, String username, Date birthday, int sex, String address) {
		super();
		this.id = id;
		this.username = username;
		this.birthday = birthday;
		this.sex = sex;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [address=" + address + ", birthday=" + birthday + ", id="
				+ id + ", sex=" + sex + ", username=" + username + "]\n";
	}
	
}
