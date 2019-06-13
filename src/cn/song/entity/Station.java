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

	public Station() {
		super();
	}

	public Station(int sId, String sName, String sIntroduction, String sAddress, String sPhone, String sBus,
			String sOpenTime, String sImg) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sIntroduction = sIntroduction;
		this.sAddress = sAddress;
		this.sPhone = sPhone;
		this.sBus = sBus;
		this.sOpenTime = sOpenTime;
		this.sImg = sImg;
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

	@Override
	public String toString() {
		return "Station [sId=" + sId + ", sName=" + sName + ", sIntroduction=" + sIntroduction + ", sAddress="
				+ sAddress + ", sPhone=" + sPhone + ", sBus=" + sBus + ", sOpenTime=" + sOpenTime + ", sImg=" + sImg
				+ "]";
	}

}
