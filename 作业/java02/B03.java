import java.util.Scanner;
public class B03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������һ����λ��������");
		int zs=input.nextInt();
		int g=zs%10;		
		int s=zs/10%10;		
		int b=zs/100%10;
		int q=zs/1000%10;
		System.out.print("��λ��"+g+"\nʮλ��"+s+"\n��λ��"+b+"\nǧλ��"+q);

	}



}
