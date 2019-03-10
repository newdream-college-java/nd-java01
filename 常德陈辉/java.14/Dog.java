package zuoye;

public class Dog {
	private String name="无名氏";
	private int healtg=100;
	private int love=80;
	private String strain="聪明的拉布拉多犬";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealtg() {
		return healtg;
	}
	public void setHealtg(int healtg) {
		this.healtg = healtg;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	public void printDog(){
		System.out.println("我的名字叫"+getName()+",健康值是"+getHealtg()+",和主人的亲密度是"+getLove()+",我是一只"+getStrain());
	}
			
}
