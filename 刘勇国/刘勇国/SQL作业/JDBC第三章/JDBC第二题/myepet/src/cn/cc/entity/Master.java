package cn.cc.entity;

import java.sql.ResultSet;

public class Master {
	private int id;
	private String name;
	private String password;
	private int money;
	private ResultSet rs;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public ResultSet getRs() {
		return rs;
	}
	public void setRs(ResultSet rs) {
		this.rs = rs;
	}
	
	public String toString() {
		return "Master [id=" + id + ", name=" + name + ", password=" + password + ", money=" + money + "]";
	}
}
