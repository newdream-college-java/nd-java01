
public class Fish extends Animal {
	private int kg;
	public Fish(int kg,String name,int age){
		this.kg=kg;
		setName(name);
		setAge(age);
		
	}
	public void info(){
		System.out.println("我是一只"+kg+"斤重的"+getName()+"!\n"+"今年"+getAge()+"岁了！");
	}
	public int getKg() {
		return kg;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
	
}
