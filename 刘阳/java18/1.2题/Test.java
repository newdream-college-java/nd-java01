import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Person person = new Person();
		System.out.print("������������");
		person.setName(in.next());
		System.out.print("�������Ա��С�Ů����");
		person.setSex(in.next());
		System.out.print("���������䣨1~100����");
		person.setAge(in.nextInt());
		person.print();

	}

}
