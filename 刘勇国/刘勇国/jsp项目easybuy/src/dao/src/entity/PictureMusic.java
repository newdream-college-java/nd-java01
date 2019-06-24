package entity;
//商品二级分类实体,图书,音乐
public class PictureMusic {
	private String name;

	public PictureMusic() {
		
	}

	public PictureMusic(String name) {
		
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
