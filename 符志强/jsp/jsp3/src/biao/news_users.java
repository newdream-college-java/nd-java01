package biao;

public class news_users {
	private int uid;
	private String uname;
	private String upwd;
	public news_users() {
	}
	public news_users(int uid, String uname, String upwd) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
	}
	@Override
	public String toString() {
		return "news_users [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd
				+ "]";
	}
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
}
