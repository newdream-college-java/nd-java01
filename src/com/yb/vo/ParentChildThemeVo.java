package com.yb.vo;

public class ParentChildThemeVo {
	private int pcnpctid;   //����id
	private int pcngsid;	//���id
	private int crPrice;	//����
	private int etPrice1;	//��ͯ
	private String image;	//ͼƬ
	private String theme;	//����
	private String address; //��ַ
	private String cost;		//����
	private String reason; //�Ƽ�����
public ParentChildThemeVo() {
		
	}
	public ParentChildThemeVo(int pcnpctid, int pcngsid, int crPrice,
			int etPrice1, String image, String theme, String address,
			String cost, String reason) {
		super();
		this.pcnpctid = pcnpctid;
		this.pcngsid = pcngsid;
		this.crPrice = crPrice;
		this.etPrice1 = etPrice1;
		this.image = image;
		this.theme = theme;
		this.address = address;
		this.cost = cost;
		this.reason = reason;
	}
	public int getPcnpctid() {
		return pcnpctid;
	}
	public void setPcnpctid(int pcnpctid) {
		this.pcnpctid = pcnpctid;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public int getPcngsid() {
		return pcngsid;
	}
	public void setPcngsid(int pcngsid) {
		this.pcngsid = pcngsid;
	}
	public int getCrPrice() {
		return crPrice;
	}
	public void setCrPrice(int crPrice) {
		this.crPrice = crPrice;
	}
	public int getEtPrice1() {
		return etPrice1;
	}
	public void setEtPrice1(int etPrice1) {
		this.etPrice1 = etPrice1;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "ParentChildThemeVo [pcnpctid=" + pcnpctid + ", pcngsid="
				+ pcngsid + ", crPrice=" + crPrice + ", etPrice1=" + etPrice1
				+ ", image=" + image + ", theme=" + theme + ", address="
				+ address + ", cost=" + cost + ", reason=" + reason + "]";
	}
	
	
	
}
