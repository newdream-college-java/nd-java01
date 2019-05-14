import java.sql.Date;


public class stu_info {
		private int id;
	    private String name;
	    private int age;
	    private String address;
	    // 数据库中的datetime-----java：Date
	    private Date birthday;
	    private String hobbies;
	    private int money;
	public stu_info(){
		
	}
	public stu_info(String name,int age,String address,Date birthday,String hobbies){
			super();
	        this.name = name;
	        this.age = age;
	        this.address = address;
	        this.birthday = birthday;
	        this.hobbies = hobbies;
	     
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", birthday="
        + birthday + ", hobbies=" + hobbies + " ]\n";
	}
	

}
