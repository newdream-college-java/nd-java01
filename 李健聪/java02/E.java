import java.util.Scanner;
public class E{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);//����һ���µ�ɨ���ǣ����ֽ���input
		      	//int a=12345;	
			System.out.print("������һ����λ����");
			int a = input.nextInt();
				//��λ
				int gw=a%10;
				int sw=a/10%10;
				int bw=a/100%10;
				int qw=a/1000%10;
				int ww=a/10000;
				System.out.println("��λ"+gw);
				System.out.println("ʮλ"+sw);
				System.out.println("��λ"+bw);
				System.out.println("ǧλ"+qw);
				System.out.println("��λ"+ww);
	}
}
//import java.util.Scanner;