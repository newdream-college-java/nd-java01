package com.cc.entity;

public class Search {
	private int id;
	private int pwd;
	private String user;

	public Search() {

	}

	public Search(int id, int pwd, String user) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Search [id=" + id + ", pwd=" + pwd + ", user=" + user + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPwd() {
		return pwd;
	}

	public void setPwd(int pwd) {
		this.pwd = pwd;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
}
