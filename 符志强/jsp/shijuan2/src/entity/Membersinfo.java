package entity;

public class Membersinfo {
	private int id;
	private String uname;
	private String usex;
	private int uage;
	private String udizhi;
	private String uemail;
	@Override
	public String toString() {
		return "membersinfo [id=" + id + ", uage=" + uage + ", udizhi="
				+ udizhi + ", uemail=" + uemail + ", uname=" + uname
				+ ", usex=" + usex + "]";
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
	public String getUsex() {
		return usex;
	}
	public void setUsex(String usex) {
		this.usex = usex;
	}
	public int getUage() {
		return uage;
	}
	public void setUage(int uage) {
		this.uage = uage;
	}
	public String getUdizhi() {
		return udizhi;
	}
	public void setUdizhi(String udizhi) {
		this.udizhi = udizhi;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public Membersinfo() {
		
	}
	public Membersinfo(int id, String uname, String usex, int uage,
			String udizhi, String uemail) {
		super();
		this.id = id;
		this.uname = uname;
		this.usex = usex;
		this.uage = uage;
		this.udizhi = udizhi;
		this.uemail = uemail;
	}
	
}
