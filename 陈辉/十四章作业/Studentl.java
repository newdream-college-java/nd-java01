package java14;
import java.util.Scanner;
public class Studentl {
	protected String name;
	protected int age;
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		Scanner input=new Scanner(System.in);
		age=input.nextInt();
		this.age = age;
		
			if(age>15){
				this.age =age;
				System.out.println("设置年龄成功！！！");
			}else{
				System.out.println("设置年龄不成功，返回默认值");
				this.age=18;
				
			}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void show(){
		System.out.println("我的名字叫"+name+"我的年龄是"+age);
	}
	public String getName(){
		return name;
	}
}
