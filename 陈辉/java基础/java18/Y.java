package java18;
import java.util.Scanner;
public class Y {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("������γ̴��ţ�1~3֮������֣�");		
		try {
			int a=input.nextInt();
			switch(a){
			case 1:
				System.out.println("C#���");
				break;						
			case 2:
				System.out.println("JAVA���");
				break;			
			case 3:
				System.out.println("SQL����");
				break;
			default :
				System.out.println("�������ֲ���ȷ");
		}
		} catch (Exception e) {
			System.out.println("�������");
		}finally{
			System.out.println("��ӭ�������");
		}

	}
}
