package com.cc.entity;
public class News {
		private int nid;
		private int ntid;
		private String ntitle;
		private String nauthor;
		private String ncreatedate;
		private String npicpath;
		private String ncontent;
		private String nmodifydate;
		private String nsummary;
		public News() {
			super();
		}
		public News(int nid, int ntid, String ntitle, String nauthor, String ncreatdate, String npicpath, String ncontent,
				String nmodifydate, String nsummary) {
			super();
			this.nid = nid;
			this.ntid = ntid;
			this.ntitle = ntitle;
			this.nauthor = nauthor;
			this.ncreatedate = ncreatedate;
			this.npicpath = npicpath;
			this.ncontent = ncontent;
			this.nmodifydate = nmodifydate;
			this.nsummary = nsummary;
		}

		public int getNid() {
			return nid;
		}

		public void setNid(int nid) {
			this.nid = nid;
		}

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

		public String getNcreatdate() {
			return ncreatedate;
		}

		public void setNcreatdate(String ncreatedate) {
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
			return "News [nid=" + nid + ", ntid=" + ntid + ", ntitle=" + ntitle + ", nauthor=" + nauthor + ", ncreatdate="
					+ ncreatedate + ", npicpath=" + npicpath + ", ncontent=" + ncontent + ", nmodifydate=" + nmodifydate
					+ ", nsummary=" + nsummary + "]";
		}

}
