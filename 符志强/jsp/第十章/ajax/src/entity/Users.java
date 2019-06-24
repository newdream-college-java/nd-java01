package entity;

public class Users {
	private int id;
	private String uname;
	private String password;
	@Override
	public String toString() {
		return "Users [id=" + id + ", password=" + password + ", uname="
				+ uname + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Users(int id, String uname, String password) {
		super();
		this.id = id;
		this.uname = uname;
		this.password = password;
	}
	public Users() {
		
	}
}
