import java.util.Scanner;
public class java04{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("������һ������(1-7)");
	if(input.hasNextInt()==true){
	int day = input.nextInt();
	switch(day){
		case 1:
			System.out.println("����һ");
		break;
		case 2:
			System.out.println("���ڶ�");
		break;
		case 3:
			System.out.println("������");
		break;
		case 4:
			System.out.println("������");
		break;
		case 5:
			System.out.println("������");
		break;
		case 6:
			System.out.println("������");
		break;
		case 7:
			System.out.println("������");
		default:
			System.out.println("��������");
		break;
	}
	}else{
		System.out.println("��������˳�����");
		System.exit(-1);
	}
	}
}