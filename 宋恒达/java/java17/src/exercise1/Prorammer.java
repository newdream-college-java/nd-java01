package exercise1;

public class Prorammer implements Write,Tall{
	private String name;
	private String profession;
	public Prorammer(String name,String profession) {
		this.name=name;
		this.profession=profession;
		System.out.println("我是一名"+this.profession+",我的名字叫"+this.name);
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
		System.out.println("我会写代码");
	}
	@Override
	public void writeCode() {
		// TODO Auto-generated method stub
		System.out.println("我会讲业务");
	}
	
}
