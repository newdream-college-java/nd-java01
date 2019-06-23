package entity;
//动态新闻实体
public class NewsInformation {
	private	String newsTitle;
	private int newsId;
	private String newsInformation;
	
	
	public NewsInformation() {
	}
	public NewsInformation(String newsTitle, int newsId, String newsInformation) {
		this.newsTitle = newsTitle;
		this.newsId = newsId;
		this.newsInformation = newsInformation;
	}
	@Override
	public String toString() {
		return "NewsInformatin [newsId=" + newsId + ", newsInformation="
				+ newsInformation + ", newsTitle=" + newsTitle + "]";
	}
	public String getNewsTitle() {
		return newsTitle;
	}
	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getNewsInformation() {
		return newsInformation;
	}
	public void setNewsInformation(String newsInformation) {
		this.newsInformation = newsInformation;
	}
	
}
