import java.util.Scanner;
public class Z2{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Dog2 dog=new Dog2("������","��������������Ȯ");		
		Penguin2 pg=new Penguin2("������","Q��");
		Pig pig=new Pig("������","��ɫ");
		System.out.println("��ӭ�����������");
		System.out.print("������Ҫ�������������");
		String name=input.next();
		System.out.print("��ѡ��Ҫ�����ĳ������ͣ���1������2�����3����");
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
		case 3:
			pig.setName(name);
			pig.print();

			break;
		default:
			System.out.println("�������");
			break;
		}
		
	}

}
