package as;

public class Stu_info {
	private int id;
	private String name;
	private int age;
	private String birthday;
	public Stu_info() {
	
	}
	public Stu_info(int id, String name, int age, String birthday) {
		super();
		this.id = id;
		this.name =name;
		this.age = age;
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Stu_info [age=" + age + ", birthday=" + birthday + ", id=" + id
				+ ", sname=" + name + "]";
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
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
}
