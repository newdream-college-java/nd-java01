import java.util.Scanner;
public class Z1_2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Dog dog=new Dog();
		Penguin pg=new Penguin();
		System.out.println("��ӭ�����������");
		System.out.print("������Ҫ�������������");
		String name=input.next();
		System.out.print("��ѡ��Ҫ�����ĳ������ͣ���1������2����죩");
		int c=input.nextInt();
		switch(c){
		case 1:
			dog.setName(name);
			dog.print();
			break;
		case 2:
			pg.setName(name);
			pg.print();

			break;
		default:
			System.out.println("�������");
			break;
		}
		
	}

}
