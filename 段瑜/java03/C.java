import java.util.Scanner;
import java.util.Random;
public class C{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Random rd=new Random();
		System.out.println("������4λ��Ա��");
		int a=rd.nextInt(10);
		int mun=input.nextInt();
		int b=mun/100%10;
		if(b==a){
			System.out.println(mun+"�ſͻ������˿ͻ�����þ���MP3һ��");
		}else{
			System.out.println("���ź�û���н�");
		}
		System.out.println("���������ǣ�"+a);
		
}
}