package java15;

public class Fish extends Animal{
	private int  weight;
	

	public Fish() {
	
		// TODO Auto-generated constructor stub
	}


	public Fish(int weight,int age) {
		this.weight = weight;
		setAge(age);
		setStrain("��");
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
		System.out.println("����һֻ"+weight+"���ص�"+getStrain());
		System.out.println("����"+getAge()+"���ˣ�");
	}

}
