package com.nd.yl.demo2;

public class Person {
	private String name;
	private int age;
	private String sex;

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
		if (age > 100 || age < 1) {
			try {
				throw new Exception("���������1-100֮�䣡");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			this.age = age;
		}

	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		if (!(sex.equals("��")) && !(sex.equals("Ů"))) {
			try {
				throw new Exception("�Ա����Ϊ�л�Ů��");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			this.sex = sex;
		}

	}

	public void print() {
		if (name != null && sex != null && age != 0) {
			System.out.println(name + "(" + sex + " " + age + ")");
		} else {
			System.out.println("��Ķ������󣡣���");
		}

	}
}
