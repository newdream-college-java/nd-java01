
public class Fish extends Animal {
	private int weight=5;
	public Fish(String strain,int age){
		setStrain(strain);
		setAge(age);
	}
	public void info(){
		System.out.println("����һֻ"+weight+"���ص�"+getStrain()+"��\n����"+getAge()+"���ˣ�");
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	/*public void show(){
		System.out.println("����һֻ"+weight+"���ص�"+getStrain());
	}*/
	
}
