package com.ch.entity;

import java.util.Date;

public class Items {
	private int id;
	private String name;
	private Float price;
	private String detail;
	private String pic;
	private Date createtime;
	public Items() {
	}
	public Items(int id, String name, Float price, String detail, String pic,
			Date createtime) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.detail = detail;
		this.pic = pic;
		this.createtime = createtime;
	}
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
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	@Override
	public String toString() {
		return "Items [createtime=" + createtime + ", detail=" + detail
				+ ", id=" + id + ", name=" + name + ", pic=" + pic + ", price="
				+ price + "]\n";
	}
	
	
}
