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
				System.out.println("��������ɹ�������");
			}else{
				System.out.println("�������䲻�ɹ�������Ĭ��ֵ");
				this.age=18;
				
			}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void show(){
		System.out.println("�ҵ����ֽ�"+name+"�ҵ�������"+age);
	}
	public String getName(){
		return name;
	}
}
