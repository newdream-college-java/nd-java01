package com.entity;

public class Handset {
	private int hid;
	private String namet;
	private int price;
	private String networkm;
	private String networkt;
	private String facade;
	private String screens;
	private String feels;

	public Handset() {

	}

	public Handset( String namet, int price, String networkm,
			String networkt, String facade, String screens, String feels) {
		super();
		this.namet = namet;
		this.price = price;
		this.networkm = networkm;
		this.networkt = networkt;
		this.facade = facade;
		this.screens = screens;
		this.feels = feels;
	}

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String getNamet() {
		return namet;
	}

	public void setNamet(String namet) {
		this.namet = namet;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getNetworkm() {
		return networkm;
	}

	public void setNetworkm(String networkm) {
		this.networkm = networkm;
	}

	public String getNetworkt() {
		return networkt;
	}

	public void setNetworkt(String networkt) {
		this.networkt = networkt;
	}

	public String getFacade() {
		return facade;
	}

	public void setFacade(String facade) {
		this.facade = facade;
	}

	public String getScreens() {
		return screens;
	}

	public void setScreens(String screens) {
		this.screens = screens;
	}

	public String getFeels() {
		return feels;
	}

	public void setFeels(String feels) {
		this.feels = feels;
	}

	@Override
	public String toString() {
		return "Handset [facade=" + facade + ", feels=" + feels + ", hid="
				+ hid + ", namet=" + namet + ", networkm=" + networkm
				+ ", networkt=" + networkt + ", price=" + price + ", screens="
				+ screens + "]\n";
	}
	

}
