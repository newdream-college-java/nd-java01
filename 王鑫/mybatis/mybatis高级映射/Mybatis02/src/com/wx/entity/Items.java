package com.wx.entity;

import java.util.Date;
import java.util.List;

public class Items {
	private Integer id;

	private String name;

	private Float price;

	private String pic;

	private Date createtime;

	private String detail;

	private List<User> user;
	// items商品表-->订单详情ordersdetail: 一对多
	private List<Orderdetail> orderdetail;

	// orders订单-->items商品表：多对多
	private List<Orders> orders;

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public List<Orderdetail> getOrderdetail() {
		return orderdetail;
	}

	public void setOrderdetail(List<Orderdetail> orderdetail) {
		this.orderdetail = orderdetail;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic == null ? null : pic.trim();
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail == null ? null : detail.trim();
	}

	@Override
	public String toString() {
		return "Items [createtime=" + createtime + ", detail=" + detail
				+ ", id=" + id + ", name=" + name + ", orderdetail="
				+ orderdetail + ", orders=" + orders + ", pic=" + pic
				+ ", price=" + price + ", user=" + user + "]\n";
	}

	/*
	 * @Override public String toString() { return "Items [createtime=" +
	 * createtime + ", detail=" + detail + ", id=" + id + ", name=" + name +
	 * ", orderdetail=" + orderdetail + ", pic=" + pic + ", price=" + price +
	 * ", user=" + user + "]"; }
	 */

	/*
	 * @Override public String toString() { return "Items [createtime=" +
	 * createtime + ", detail=" + detail + ", id=" + id + ", name=" + name +
	 * ", pic=" + pic + ", price=" + price + ", user=" + user + "]\n"; }
	 */

	/*
	 * @Override public String toString() { return "Items [id=" + id + ", name="
	 * + name + ", price=" + price + ", pic=" + pic + ", createtime=" +
	 * createtime + ", detail=" + detail + "]\n"; }
	 */

}