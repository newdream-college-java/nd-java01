package java18;

import java.util.InputMismatchException;

public class Re {
	private String name;
	private int age;
	private char sex;
	public void print(){
		System.out.println(name+"("+sex+","+age+"��)");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(1<=age&&age<=100){
			this.age = age;
		}else{
			throw new InputMismatchException("���������1��100֮�䣡");
		}


	}
	public char getSex() {
		return sex;
	}


	public void setSex(char sex) {
		if(sex=='��'||sex=='Ů'){
			this.sex = sex;
		}else{
			throw new InputMismatchException("�Ա�����ǡ��С����ߡ�Ů����");
		}

	}
}
