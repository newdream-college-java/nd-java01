import java.util.Scanner;
public class T8{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ�����");
		int a=input.nextInt();
		if(a%4==0&&a%100!=0||a%400==0){
			System.out.print(a+"������");
		}else{
			System.out.print(a+"��������");
		}
	}
}