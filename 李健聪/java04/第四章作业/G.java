import java.util.Scanner;
public class G{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("������һ����     ");
		double sr,sc;
		sr=input.nextDouble();
		System.out.print("��������һ����   ");
		sc=input.nextDouble();
		System.out.println("������Ҫ��������ķ���     ");
		String a=input.next();
		if(a.equals("+")){
			System.out.println("���������="+(sr+sc));
		}
		if(a.equals("-")){
			System.out.println("���������="+(sr-sc));
		}
		if(a.equals("*")){
			System.out.println("���������="+(sr*sc));
		}
		if(a.equals("/")){
			System.out.println("���������="+(sr/sc));
		}
		
	}
}