package biao;

public class topic {
	private int tid;
	private String tname;
	public topic() {
	}
	public topic(int tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
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
	
}
