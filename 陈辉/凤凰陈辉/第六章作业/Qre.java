import java.util.Scanner;
public class Qre{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("ѭ������5��ѧ���ɼ���");
		//int a =input.nextInt();
		int h=0;
		int i=1;
		while(i<6&&i>=1){
			//h=h+a;
			System.out.println("��������ĳɼ�");
			int a=input.nextInt();
			
			if(a>80){
				h=h+1;
				//System.out.println(a);
			}
				i++;

		}		System.out.println("����80������\t"+h"λ");
			
	}

}