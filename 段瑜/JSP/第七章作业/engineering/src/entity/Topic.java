package entity;

public class Topic {
	private int tid;
	private String tname;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "topic [tid=" + tid + ", tname=" + tname + "]";
	}
	public Topic(int tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
	public Topic() {
		
	}
	public Topic(int tid) {
		super();
		this.tid = tid;
	}
	public Topic(String tname) {
		super();
		this.tname = tname;
	}
}
