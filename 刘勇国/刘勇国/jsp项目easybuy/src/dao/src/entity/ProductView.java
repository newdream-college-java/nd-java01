package entity;
//…Ã∆∑œÍ«È
public class ProductView {
	private int productViewId ;
	private int productViewStore;
	private String productViewName;
	private String productViewPicture;
	private String productViewDescription;
	private double productViewPrice;
	
	public ProductView() {
		
	}
	public ProductView(int productViewId, int productViewStore,
			String productViewName, String productViewPicture,
			String productViewDescription, double productViewPrice) {
		super();
		this.productViewId = productViewId;
		this.productViewStore = productViewStore;
		this.productViewName = productViewName;
		this.productViewPicture = productViewPicture;
		this.productViewDescription = productViewDescription;
		this.productViewPrice = productViewPrice;
	}
	public int getProductViewId() {
		return productViewId;
	}
	public void setProductViewId(int productViewId) {
		this.productViewId = productViewId;
	}
	public int getProductViewStore() {
		return productViewStore;
	}
	public void setProductViewStore(int productViewStore) {
		this.productViewStore = productViewStore;
	}
	public String getProductViewName() {
		return productViewName;
	}
	public void setProductViewName(String productViewName) {
		this.productViewName = productViewName;
	}
	public String getProductViewPicture() {
		return productViewPicture;
	}
	public void setProductViewPicture(String productViewPicture) {
		this.productViewPicture = productViewPicture;
	}
	public String getProductViewDescription() {
		return productViewDescription;
	}
	public void setProductViewDescription(String productViewDescription) {
		this.productViewDescription = productViewDescription;
	}
	public double getProductViewPrice() {
		return productViewPrice;
	}
	public void setProductViewPrice(double productViewPrice) {
		this.productViewPrice = productViewPrice;
	}
	@Override
	public String toString() {
		return "ProductView [productViewDescription=" + productViewDescription
				+ ", productViewId=" + productViewId + ", productViewName="
				+ productViewName + ", productViewPicture="
				+ productViewPicture + ", productViewPrice=" + productViewPrice
				+ ", productViewStore=" + productViewStore + "]";
	}
	
}
