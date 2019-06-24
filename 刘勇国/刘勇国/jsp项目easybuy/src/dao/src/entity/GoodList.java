package entity;
//首页商品列表
public class GoodList {
	private int pictureId;
	private String picturePath;
	private String pictureTitle;
	private double picturePrice;
	private int productViewId;

	public GoodList() {
	
	}
	public GoodList(int pictureId, String picturePath, String pictureTitle,
			double picturePrice ,int productViewId) {
		super();
		this.pictureId = pictureId;
		this.picturePath = picturePath;
		this.pictureTitle = pictureTitle;
		this.picturePrice = picturePrice;
		this.productViewId=productViewId;
	}
	
	public int getProductViewId() {
		return productViewId;
	}
	public void setProductViewId(int productViewId) {
		this.productViewId = productViewId;
	}
	public int getPictureId() {
		return pictureId;
	}
	public void setPictureId(int pictureId) {
		this.pictureId = pictureId;
	}
	public String getPicturePath() {
		return picturePath;
	}
	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}
	public String getPictureTitle() {
		return pictureTitle;
	}
	public void setPictureTitle(String pictureTitle) {
		this.pictureTitle = pictureTitle;
	}
	public double getPicturePrice() {
		return picturePrice;
	}
	public void setPicturePrice(double picturePrice) {
		this.picturePrice = picturePrice;
	}
	@Override
	public String toString() {
		return "GoodList [pictureId=" + pictureId + ", picturePath="
				+ picturePath + ", picturePrice=" + picturePrice
				+ ", pictureTitle=" + pictureTitle + ", productViewId="
				+ productViewId + "]\n";
	}
	
	
	
}
