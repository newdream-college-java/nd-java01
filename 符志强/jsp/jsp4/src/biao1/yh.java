package biao1;

public class yh {
	private int id;
	private String name;
	private String pwd;
	public yh(int id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	public yh() {
		
	}
	@Override
	public String toString() {
		return "yh [id=" + id + ", name=" + name + ", pwd=" + pwd + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
