import java.util.Scanner;
public class Hw07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//��ʾ
		System.out.print("������1~7�м��һ��������");
		int a =input.nextInt();
		switch(a){
			case 1:
				System.out.print("MON");
			break;
			case 2:
				System.out.print("TUE");
			break;
			case 3:
				System.out.print("WED");
			break;
			case 4:
				System.out.print("THU");
			break;
			case 5:
				System.out.print("FRI");
			break;
			case 6:
				System.out.print("SAT");
			break;
			case 7:
				System.out.print("SUN");
			break;
			default:
				while(a!=0){
					//��ʾ������󣬲���������
					System.out.print("�����������������");
					a=input.nextInt();
					
				}
				System.exit(-1);
		}
	}
}