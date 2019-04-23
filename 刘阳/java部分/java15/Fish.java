
public class Fish extends Animal {
	private int weight=5;
	public Fish(String strain,int age){
		setStrain(strain);
		setAge(age);
	}
	public void info(){
		System.out.println("我是一只"+weight+"斤重的"+getStrain()+"！\n今年"+getAge()+"岁了！");
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	/*public void show(){
		System.out.println("我是一只"+weight+"斤重的"+getStrain());
	}*/
	
}
