import java.util.Scanner;
public class Z3_1 {
	public static void main(String[] args) {
		Student1 sd1=new Student1();
		Scanner input=new Scanner(System.in);
		System.out.println("������������");
		String name=input.next();
		System.out.println("���������䣺");
		int age=input.nextInt();		
		sd1.setName(name);
		sd1.setAge(age);
		sd1.show();
	}
}
