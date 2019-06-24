package cn.song.entity;

public class Station {
	private int sId;// 车站信息表主键
	private String sName;// 车站名
	private String sIntroduction;// 车站介绍
	private String sAddress;// 车站地址
	private String sPhone;// 车站联系电话
	private String sBus;// 途经公交
	private String sOpenTime;// 开通时间
	private String sImg;// 车站图片地址
	private String city;// 所在城市
	private String isSelect;// 始发站查询条件

	public String getIsSelect() {
		return isSelect;
	}

	public void setIsSelect(String isSelect) {
		this.isSelect = isSelect;
	}

	public Station() {
		super();
	}

	public Station(int sId, String sName, String sIntroduction, String sAddress, String sPhone, String sBus,
			String sOpenTime, String sImg, String city) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sIntroduction = sIntroduction;
		this.sAddress = sAddress;
		this.sPhone = sPhone;
		this.sBus = sBus;
		this.sOpenTime = sOpenTime;
		this.sImg = sImg;
		this.city = city;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsIntroduction() {
		return sIntroduction;
	}

	public void setsIntroduction(String sIntroduction) {
		this.sIntroduction = sIntroduction;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public String getsPhone() {
		return sPhone;
	}

	public void setsPhone(String sPhone) {
		this.sPhone = sPhone;
	}

	public String getsBus() {
		return sBus;
	}

	public void setsBus(String sBus) {
		this.sBus = sBus;
	}

	public String getsOpenTime() {
		return sOpenTime;
	}

	public void setsOpenTime(String sOpenTime) {
		this.sOpenTime = sOpenTime;
	}

	public String getsImg() {
		return sImg;
	}

	public void setsImg(String sImg) {
		this.sImg = sImg;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Station [city=" + city + ", sAddress=" + sAddress + ", sBus=" + sBus + ", sId=" + sId + ", sImg=" + sImg
				+ ", sIntroduction=" + sIntroduction + ", sName=" + sName + ", sOpenTime=" + sOpenTime + ", sPhone="
				+ sPhone + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == this) {
			return true;
		}
		if (obj instanceof Station) {
			obj = obj;
			if (((Station) obj).getsName().equals(this.getsName())) {
				return true;
			}
		}
		return false;
	}
}