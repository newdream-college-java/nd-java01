package com.cc.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 
    * @ClassName: User  
    * @Description: 用户信息  
    * @author 新梦想IT学院.陈超
    * @date 2019年7月23日  
    *    
 */
public class User implements Serializable {
	private int id;
	private String username;// 用户姓名
	private String sex;// 性别
	private Date birthday;// 生日
	private String address;// 地址
	
	private List<Orders> orders;
	
	private List<Items> ltems;

	public List<Items> getLtems() {
		return ltems;
	}

	public void setLtems(List<Items> ltems) {
		this.ltems = ltems;
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

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "User [address=" + address + ", birthday=" + birthday + ", id="
				+ id + ", orders=" + orders + ", sex=" + sex + ", username="
				+ username+ ltems+ "]";
	}

	

}
