package entity;
//��Ʒ��������ʵ��,ͼ��,����
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
