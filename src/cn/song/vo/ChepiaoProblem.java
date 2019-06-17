package cn.song.vo;

public class ChepiaoProblem {
	private String pContent;// 问题内容
	private String prContent;// 回复内容

	public ChepiaoProblem() {
		super();
	}

	public ChepiaoProblem(String pContent, String prContent) {
		super();
		this.pContent = pContent;
		this.prContent = prContent;
	}

	public String getpContent() {
		return pContent;
	}

	public void setpContent(String pContent) {
		this.pContent = pContent;
	}

	public String getPrContent() {
		return prContent;
	}

	public void setPrContent(String prContent) {
		this.prContent = prContent;
	}

	@Override
	public String toString() {
		return "ChepiaoProblem [pContent=" + pContent + ", prContent=" + prContent + "]";
	}

}
