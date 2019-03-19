package exercise2;

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

	public void setAge(int age) throws Exception {
		if((age>=1)&&(age<=100)) {
		this.age = age;
		}else {
			throw new Exception("���������1��100֮�䣡");
		}
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) throws Exception {
		if (!(sex.equals("��") || (sex.equals("Ů")))) {
			throw new Exception("�Ա�������л���Ů��");
		} else {
			this.sex = sex;
		}
	}

	public void print() {
		System.out.println(name + "(" + sex + "," + age + "��)");
	}
}
