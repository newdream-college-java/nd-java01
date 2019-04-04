public class Student1 {

	private String name;
	private int age;
	public void show(){
		System.out.println("我的名字叫"+name+"我的年龄是"+age);
		
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
		if(age>15){
			this.age =age;
			System.out.println("设置年龄成功！！！");
		}else{
			System.out.println("设置年龄不成功，返回默认值");
			this.age=18;
			
		}

	
	}
}
