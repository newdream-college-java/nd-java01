import java.util.Scanner;
public class Zylei6 {
	Scanner input=new Scanner(System.in);
	int year;
	public void y() {
		System.out.println("������һ����");
		int n=input.nextInt();
		if (n%4==0&&n%100!=0||n%400==0) {
			System.out.println(n+"������");
		}else{
			System.out.println(n+"��������");
		}		
	}
}
