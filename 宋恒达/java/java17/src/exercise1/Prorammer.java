package exercise1;

public class Prorammer implements Write,Tall{
	private String name;
	private String profession;
	public Prorammer(String name,String profession) {
		this.name=name;
		this.profession=profession;
		System.out.println("����һ��"+this.profession+",�ҵ����ֽ�"+this.name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	@Override
	public void tallAbout() {
		// TODO Auto-generated method stub
		System.out.println("�һ�д����");
	}
	@Override
	public void writeCode() {
		// TODO Auto-generated method stub
		System.out.println("�һὲҵ��");
	}
	
}
