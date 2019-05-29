package entity;

public class New_users {
	private int uid;
	private String uname;
	private String upwd;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public New_users(int uid, String uname, String upwd) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
	}
	public New_users() {	
	}
	public New_users( String uname, String upwd) {
		super();
		this.uname = uname;
		this.upwd = upwd;
	}
	@Override
	public String toString() {
		return "New_users [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd
				+ "]";
	}
}
