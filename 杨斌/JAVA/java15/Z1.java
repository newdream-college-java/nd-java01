import java.util.Scanner;
public class Z1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Car car=new Car();
		Bus bus=new Bus();
		System.out.println("��ӭ������������ƾ��˾��");
		System.out.println("������Ҫ��ƾ��������");
		int day=input.nextInt();
		System.out.println("������Ҫ��ƾ���������ͣ�1���γ�  2���ͳ�����");
		int a =input.nextInt();
		switch(a){
		case 1:
			car.setDay(day);
			car.setName("�γ�");
			car.show();
			car.print();
			break;
		case 2:
			bus.setDay(day);
			bus.setName("�ͳ�");
			bus.show();
			bus.print();
			break;
		default:
			System.out.println("�������");
		}
		
		
	}

}
