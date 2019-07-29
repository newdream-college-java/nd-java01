package com.cb.entity;

import java.util.Date;
import java.util.List;


public class User  {
	private int id;
	private String username;
	private String sex;
	private Date birthday;
	private String address;
	//一对多 user---->orders订单
	private List<Orders>orders;
	
	private List<Items>items;
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
/*	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", sex=" + sex
				+ ", birthday=" + birthday + ", address=" + address + "]";
	}
*/
	/*@Override
	public String toString() {
		return "User [address=" + address + ", birthday=" + birthday + ", id="
				+ id + ", orders=" + orders + ", sex=" + sex + ", username="
				+ username + "]\n";
	}*/
	@Override
	public String toString() {
		return "User [address=" + address + ", birthday=" + birthday + ", id="
				+ id + ", items=" + items + ", orders=" + orders + ", sex="
				+ sex + ", username=" + username + "]\n";
	}
	
	

}
