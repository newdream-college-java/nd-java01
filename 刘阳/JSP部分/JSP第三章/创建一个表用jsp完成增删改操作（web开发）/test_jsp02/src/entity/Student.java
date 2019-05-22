package entity;

public class Student {
	private  int id;
	private  String sname;
	private  int sage;
	
	@Override
	public String toString() {
		return "Student id=" + id + ", sage=" + sage + ", sname=" + sname
				;
	}
	public Student() {
		
	}
	public Student(String sname, int sage) {
		super();

		this.sname = sname;
		this.sage = sage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
}
