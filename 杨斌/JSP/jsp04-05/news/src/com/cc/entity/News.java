package com.cc.entity;

import java.text.DateFormat;

public class News {
	private String utitle;
	private String date;
	public News() {

	}
	public News(String utitle,String date) {
		this.utitle = utitle;
		this.date = date;
	}
	public String getUtitle() {
		return utitle;
	}
	public void setUtitle(String utitle) {
		this.utitle = utitle;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "News [utitle=" + utitle + ", date=" + date + "]";
	}
	
}
