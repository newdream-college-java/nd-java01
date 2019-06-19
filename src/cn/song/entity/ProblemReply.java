package cn.song.entity;

public class ProblemReply {
	private int prId;// 问题回复id
	private String prContent;// 回复内容
	private String prTime;// 回复时间
	private int prPtId;// 对应的问题id

	public ProblemReply() {
		super();
	}

	public ProblemReply(int prId, String prContent, String prTime, int prPtId) {
		super();
		this.prId = prId;
		this.prContent = prContent;
		this.prTime = prTime;
		this.prPtId = prPtId;
	}

	public int getPrId() {
		return prId;
	}

	public void setPrId(int prId) {
		this.prId = prId;
	}

	public String getPrContent() {
		return prContent;
	}

	public void setPrContent(String prContent) {
		this.prContent = prContent;
	}

	public String getPrTime() {
		return prTime;
	}

	public void setPrTime(String prTime) {
		this.prTime = prTime;
	}

	public int getPrPtId() {
		return prPtId;
	}

	public void setPrPtId(int prPtId) {
		this.prPtId = prPtId;
	}

	@Override
	public String toString() {
		return "ProblemReply [prId=" + prId + ", prContent=" + prContent + ", prTime=" + prTime + ", prPtId=" + prPtId
				+ "]";
	}

}
