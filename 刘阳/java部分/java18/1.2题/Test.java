import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Person person = new Person();
		System.out.print("请输入姓名：");
		person.setName(in.next());
		System.out.print("请输入性别（男、女）：");
		person.setSex(in.next());
		System.out.print("请输入年龄（1~100）：");
		person.setAge(in.nextInt());
		person.print();

	}

}
