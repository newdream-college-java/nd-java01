package java11;
import java.util.Scanner;
public class Y9 {
	String nain;
	int a;
	public void show(){
		Scanner input=new Scanner(System.in);
		System.out.println("�������");
		a=input.nextInt();
		if(a%4==0&&a%100!=0||a%400==0) {
			System.out.println("��һ��������");
			
		}else{
			System.out.println("��һ����ƽ��");
		}
		
	}
}
