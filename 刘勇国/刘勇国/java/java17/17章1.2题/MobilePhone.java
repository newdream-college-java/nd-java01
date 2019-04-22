package 第17章接口手机1_2作业;

public abstract class MobilePhone {
	private String type;
	//如果父类有构造方法，子类也有构造方法。。。情况再搞下，没搞明白
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public abstract void show();
}
