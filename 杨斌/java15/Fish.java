
public class Fish extends Animal {
	private int kg;
	public Fish(int kg,String name,int age){
		this.kg=kg;
		setName(name);
		setAge(age);
		
	}
	public void info(){
		System.out.println("����һֻ"+kg+"���ص�"+getName()+"!\n"+"����"+getAge()+"���ˣ�");
	}
	public int getKg() {
		return kg;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
	
}
