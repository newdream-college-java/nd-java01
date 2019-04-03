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
			throw new Exception("年龄必须在1到100之间！");
		}
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) throws Exception {
		if (!(sex.equals("男") || (sex.equals("女")))) {
			throw new Exception("性别必须是男或者女！");
		} else {
			this.sex = sex;
		}
	}

	public void print() {
		System.out.println(name + "(" + sex + "," + age + "岁)");
	}
}
