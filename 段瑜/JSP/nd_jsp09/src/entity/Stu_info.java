package entity;

public class Stu_info {
	private int sid;
	private String sname;
	private int sage;
	private String sbirthday;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getSbirthday() {
		return sbirthday;
	}
	public void setSbirthday(String sbirthday) {
		this.sbirthday = sbirthday;
	}
	public Stu_info(){
	}
	public Stu_info( int sid) {
		super();
		this.sid = sid;
	}
	public Stu_info( int sid,String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public Stu_info( String sname, int sage, String sbirthday) {
		super();
		
		this.sname = sname;
		this.sage = sage;
		this.sbirthday = sbirthday;
	}
	@Override
	public String toString() {
		return "Stu_info [sage=" + sage + ", sbirthday=" + sbirthday + ", sid="
				+ sid + ", sname=" + sname + "]";
	}
}
