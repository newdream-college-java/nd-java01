import java.util.Scanner;
import java.util.Random;
public class Zy7{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Random rd=new Random();
		System.out.println("��������λ��Ա�ţ�");
		int a=input.nextInt();
		int bw=a/100%10;
		int b=rd.nextInt(10);		
		if (bw==b){
			System.out.print(a+"�ſͻ������˿ͻ�����þ���Mp3һ����");

		}else{
			System.out.print(a+"�ſͻ���лл����֧��");
		}

	}
	



}