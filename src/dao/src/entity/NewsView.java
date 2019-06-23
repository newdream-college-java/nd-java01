package entity;
//新闻详情实体
public class NewsView {
	private int newsId;
	private String newsTitle;
	private String newsContent;
	private String newsTime;
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getNewsTitle() {
		return newsTitle;
	}
	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}
	public String getNewsContent() {
		return newsContent;
	}
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}
	public String getNewsTime() {
		return newsTime;
	}
	public void setNewsTime(String newsTime) {
		this.newsTime = newsTime;
	}
	@Override
	public String toString() {
		return "NewsView [newsContent=" + newsContent + ", newsId=" + newsId
				+ ", newsTime=" + newsTime + ", newsTitle=" + newsTitle + "]";
	}
	
}
