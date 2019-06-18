package cn.song.entity;

public class User {
	private int uId;// 用户id
	private String tRealName;// 真实姓名
	private String tIdNumber;// 身份证号
	private String uName;// 用户名
	private String uPwd;// 密码
	private String uNickname;// 昵称
	private String uSex;// 性别
	private String uPhone;// 手机号
	private String uEmail;// 邮箱
	private int uIsAdult;// 是否成人
	private String uBirthday;// 出生日期
	private int uMoney;// 钱包

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int uId, String tRealName, String tIdNumber, String uName, String uPwd, String uNickname, String uSex,
			String uPhone, String uEmail, int uIsAdult, String uBirthday, int uMoney) {
		super();
		this.uId = uId;
		this.tRealName = tRealName;
		this.tIdNumber = tIdNumber;
		this.uName = uName;
		this.uPwd = uPwd;
		this.uNickname = uNickname;
		this.uSex = uSex;
		this.uPhone = uPhone;
		this.uEmail = uEmail;
		this.uIsAdult = uIsAdult;
		this.uBirthday = uBirthday;
		this.uMoney = uMoney;
	}

	public String gettRealName() {
		return tRealName;
	}

	public void settRealName(String tRealName) {
		this.tRealName = tRealName;
	}

	public String gettIdNumber() {
		return tIdNumber;
	}

	public void settIdNumber(String tIdNumber) {
		this.tIdNumber = tIdNumber;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPwd() {
		return uPwd;
	}

	public void setuPwd(String uPwd) {
		this.uPwd = uPwd;
	}

	public String getuNickname() {
		return uNickname;
	}

	public void setuNickname(String uNickname) {
		this.uNickname = uNickname;
	}

	public String getuSex() {
		return uSex;
	}

	public void setuSex(String uSex) {
		this.uSex = uSex;
	}

	public String getuPhone() {
		return uPhone;
	}

	public void setuPhone(String uPhone) {
		this.uPhone = uPhone;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	public int getuIsAdult() {
		return uIsAdult;
	}

	public void setuIsAdult(int uIsAdult) {
		this.uIsAdult = uIsAdult;
	}

	public String getuBirthday() {
		return uBirthday;
	}

	public void setuBirthday(String uBirthday) {
		this.uBirthday = uBirthday;
	}

	public int getuMoney() {
		return uMoney;
	}

	public void setuMoney(int uMoney) {
		this.uMoney = uMoney;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", tRealName=" + tRealName + ", tIdNumber=" + tIdNumber + ", uName=" + uName
				+ ", uPwd=" + uPwd + ", uNickname=" + uNickname + ", uSex=" + uSex + ", uPhone=" + uPhone + ", uEmail="
				+ uEmail + ", uIsAdult=" + uIsAdult + ", uBirthday=" + uBirthday + ", uMoney=" + uMoney + "]";
	}

}
