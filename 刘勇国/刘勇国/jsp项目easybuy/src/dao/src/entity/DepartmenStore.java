package entity;
//二级商品分类,百货
public class DepartmenStore {
	private String name;

	public DepartmenStore() {
		
	}

	public DepartmenStore(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PictureMusic [name=" + name + "]";
	}
	
	
}	
