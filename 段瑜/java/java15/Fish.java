package ����;

public class Fish extends Animal{
	private int jin;

	public int getJin() {
		return jin;
	}

	public void setJin(int jin) {
		this.jin = jin;
	}
	Fish(String name,int age,int jin){
		setName(name);
		setAge(age);
		setJin(jin);
		System.out.println("����һֻ"+getJin()+"�ص�"+getName()+"\n����"+getAge()+"����");
	}
}
