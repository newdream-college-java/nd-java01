package cn.song.entity;
/**
* @author mo
* @version 2019年5月27日 下午7:15:53
* @description
*/
public class User {
	private String uname;
	private String upwd;
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
	@Override
	public String toString() {
		return "User [uname=" + uname + ", upwd=" + upwd + "]";
	}
	
}
