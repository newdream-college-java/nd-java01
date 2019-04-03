package java15;

public class Fish extends Animal{
	private int  weight;
	

	public Fish() {
	
		// TODO Auto-generated constructor stub
	}


	public Fish(int weight,int age) {
		this.weight = weight;
		setAge(age);
		setStrain("鱼");
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("我是一只"+weight+"斤重的"+getStrain());
		System.out.println("今年"+getAge()+"岁了！");
	}

}
