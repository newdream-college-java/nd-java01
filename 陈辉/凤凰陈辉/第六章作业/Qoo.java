import java.util.Scanner;
public class Qoo{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("ѭ���������0������");
		int a = input.nextInt();
		int h=0;
		while(a>0){
			h=h+a;
			System.out.println("�������0������");
			a = input.nextInt(); 
			//h=h+a;
			//System.out.println("��");
			if(a==0){
			//System.out.println("����");
			break;
			}
		}	System.out.println("��"+h);
	}

}