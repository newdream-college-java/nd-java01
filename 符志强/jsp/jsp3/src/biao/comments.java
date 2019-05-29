package biao;

public class comments {
	private int cid;
	private int cnid;
	private String ccontent;
	private String cdate;
	private String cip;
	private String cauthor;
	@Override
	public String toString() {
		return "comments [cauthor=" + cauthor + ", ccontent=" + ccontent
				+ ", cdate=" + cdate + ", cid=" + cid + ", cip=" + cip
				+ ", cnid=" + cnid + "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getCnid() {
		return cnid;
	}
	public void setCnid(int cnid) {
		this.cnid = cnid;
	}
	public String getCcontent() {
		return ccontent;
	}
	public void setCcontent(String ccontent) {
		this.ccontent = ccontent;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	public String getCip() {
		return cip;
	}
	public void setCip(String cip) {
		this.cip = cip;
	}
	public String getCauthor() {
		return cauthor;
	}
	public void setCauthor(String cauthor) {
		this.cauthor = cauthor;
	}
	public comments() {
		
	}
	public comments(int cid, int cnid, String ccontent, String cdate,
			String cip, String cauthor) {
		super();
		this.cid = cid;
		this.cnid = cnid;
		this.ccontent = ccontent;
		this.cdate = cdate;
		this.cip = cip;
		this.cauthor = cauthor;
	}

}
