package entity;

public class HandSet {
	private int hs_id;
	private int price;
	private String name_type;
	private String network_type;
	private String nerwork_mode;
	private String facade;
	private String screeen_size;
	private String feel_screen;
	@Override
	public String toString() {
		return "HandSet [facade=" + facade + ", feel_screen=" + feel_screen
				+ ", hs_id=" + hs_id + ", name_type=" + name_type
				+ ", nerwork_mode=" + nerwork_mode + ", network_type="
				+ network_type + ", price=" + price + ", screeen_size="
				+ screeen_size + "]";
	}
	public int getHs_id() {
		return hs_id;
	}
	public void setHs_id(int hsId) {
		hs_id = hsId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName_type() {
		return name_type;
	}
	public void setName_type(String nameType) {
		name_type = nameType;
	}
	public String getNetwork_type() {
		return network_type;
	}
	public void setNetwork_type(String networkType) {
		network_type = networkType;
	}
	public String getNerwork_mode() {
		return nerwork_mode;
	}
	public void setNerwork_mode(String nerworkMode) {
		nerwork_mode = nerworkMode;
	}
	public String getFacade() {
		return facade;
	}
	public void setFacade(String facade) {
		this.facade = facade;
	}
	public String getScreeen_size() {
		return screeen_size;
	}
	public void setScreeen_size(String screeenSize) {
		screeen_size = screeenSize;
	}
	public String getFeel_screen() {
		return feel_screen;
	}
	public void setFeel_screen(String feelScreen) {
		feel_screen = feelScreen;
	}
	public HandSet() {
	}
	public HandSet(int hsId, int price, String nameType, String networkType,
			String nerworkMode, String facade, String screeenSize,
			String feelScreen) {
		super();
		hs_id = hsId;
		this.price = price;
		name_type = nameType;
		network_type = networkType;
		nerwork_mode = nerworkMode;
		this.facade = facade;
		screeen_size = screeenSize;
		feel_screen = feelScreen;
	}
	
}
