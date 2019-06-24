package cn.song.entity;

public class Problem {
	private int pId;// 问题id
	private String pContent;// 问题内容
	private String pSupply;// 问题补充
	private int pTypeId;// 问题类型表id
	private String pTime;// 问题提问时间
	private int pStatus;// 问题状态，0代表正在处理，1代表已解决的问题
	private int uId;// 用户表id

	public Problem() {

	}

	public Problem(int pId, String pContent, String pSupply, int pTypeId, String pTime, int pStatus, int uId) {
		super();
		this.pId = pId;
		this.pContent = pContent;
		this.pSupply = pSupply;
		this.pTypeId = pTypeId;
		this.pTime = pTime;
		this.pStatus = pStatus;
		this.uId = uId;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpContent() {
		return pContent;
	}

	public void setpContent(String pContent) {
		this.pContent = pContent;
	}

	public String getpSupply() {
		return pSupply;
	}

	public void setpSupply(String pSupply) {
		this.pSupply = pSupply;
	}

	public int getpTypeId() {
		return pTypeId;
	}

	public void setpTypeId(int pTypeId) {
		this.pTypeId = pTypeId;
	}

	public String getpTime() {
		return pTime;
	}

	public void setpTime(String pTime) {
		this.pTime = pTime;
	}

	public int getpStatus() {
		return pStatus;
	}

	public void setpStatus(int pStatus) {
		this.pStatus = pStatus;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	@Override
	public String toString() {
		return "Problem [pId=" + pId + ", pContent=" + pContent + ", pSupply=" + pSupply + ", pTypeId=" + pTypeId
				+ ", pTime=" + pTime + ", pStatus=" + pStatus + ", uId=" + uId + "]";
	}

}
