package Test2019_3_8_z14;

public class Animal_2 {
	private String name;
	private String color;
	int health=100;
	int intimacy = 80;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public void show() {
		System.out.println("�����԰ף�");
		System.out.println("�ҵ����ֽ�"+getName()+",����ֵ�ǣ�"+health+",�����˵����ܶ�:"+intimacy+",�ҵ�ë����ɫ��"+getColor());
	}

}
