package zuoye;

public class Person {
	private int id;
	private String name;
	private int age;
	private int isMarried;
	public Person() {

	}

	public Person(int id, String name, int isMarried, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.isMarried = isMarried;
	}

	public Person(String name, int isMarried ,int age) {
		super();
		this.name = name;
		this.age = age;
		this.isMarried = isMarried;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", id=" + id + ", isMarried=" + isMarried
				+ ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		this.age = age;
	}
	public int getIsMarried() {
		return isMarried;
	}
	public void setIsMarried(int isMarried) {
		this.isMarried = isMarried;
	}
	
}
