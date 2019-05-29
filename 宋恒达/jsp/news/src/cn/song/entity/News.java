package cn.song.entity;
/**
* @author mo
* @version 2019年5月27日 下午8:07:26
* @description
*/
public class News {
	private int ntid;
	private String ntitle;
	private String nauthor;
	private String ncreatedate;
	private String npicpath;
	private String ncontent;
	private String nmodifydate;
	private String nsummary;
	public int getNtid() {
		return ntid;
	}
	public void setNtid(int ntid) {
		this.ntid = ntid;
	}
	public String getNtitle() {
		return ntitle;
	}
	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}
	public String getNauthor() {
		return nauthor;
	}
	public void setNauthor(String nauthor) {
		this.nauthor = nauthor;
	}
	public String getNcreatedate() {
		return ncreatedate;
	}
	public void setNcreatedate(String ncreatedate) {
		this.ncreatedate = ncreatedate;
	}
	public String getNpicpath() {
		return npicpath;
	}
	public void setNpicpath(String npicpath) {
		this.npicpath = npicpath;
	}
	public String getNcontent() {
		return ncontent;
	}
	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}
	public String getNmodifydate() {
		return nmodifydate;
	}
	public void setNmodifydate(String nmodifydate) {
		this.nmodifydate = nmodifydate;
	}
	public String getNsummary() {
		return nsummary;
	}
	public void setNsummary(String nsummary) {
		this.nsummary = nsummary;
	}
	@Override
	public String toString() {
		return "News [ntid=" + ntid + ", ntitle=" + ntitle + ", nauthor=" + nauthor + ", ncreatedate=" + ncreatedate
				+ ", npicpath=" + npicpath + ", ncontent=" + ncontent + ", nmodifydate=" + nmodifydate + ", nsummary="
				+ nsummary + "]";
	}
	
}
