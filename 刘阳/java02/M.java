import java.util.Scanner;
public class M{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����λ����");
		int num = input.nextInt();
		//��������ÿ����λ�ϵ���
		int a=num%10;
		int b=num/10%10;
		int c=num/100%10;
		System.out.println("����֮ǰΪ��"+num);
		int d=a;
		a=c;
		c=d;


		
		System.out.print(c+""+b+""+a);
		/*System.out.print(b);
		System.out.print(a);*/
	}
}