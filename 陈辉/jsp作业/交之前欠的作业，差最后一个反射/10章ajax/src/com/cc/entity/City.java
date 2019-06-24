package com.cc.entity;

public class City {
	/* 城市的编号 */
	private int cid;
	/* 城市的名字 */
	private String name;

	public City() {
	}

	public City(int cid, String name) {
		super();
		this.cid = cid;
		this.name = name;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
