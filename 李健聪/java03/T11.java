import java.util.Scanner;
public class T11{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ������");
		int num = input.nextInt();
		switch(num){
		case 0:
			System.out.println("����С����");
			break;
		case 1:
			System.out.println("����������");
			break;
		case 2: 	
			System.out.println("����������");
			break;
		default:
			System.out.println("����ʲô��");
		}
	}
}