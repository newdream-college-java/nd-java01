package cn.song.entity;

public class User {
	private int uId;// �û�id
	private String tRealName;// ��ʵ����
	private String tIdNumber;// ���֤��
	private String uName;// �û���
	private String uPwd;// ����
	private String uNickname;// �ǳ�
	private String uSex;// �Ա�
	private String uPhone;// �ֻ���
	private String uEmail;// ����
	private int uIsAdult;// �Ƿ����

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
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

	@Override
	public String toString() {
		return "User [uId=" + uId + ", tRealName=" + tRealName + ", tIdNumber=" + tIdNumber + ", uName=" + uName
				+ ", uPwd=" + uPwd + ", uNickname=" + uNickname + ", uSex=" + uSex + ", uPhone=" + uPhone + ", uEmail="
				+ uEmail + ", uIsAdult=" + uIsAdult + "]";
	}

}
