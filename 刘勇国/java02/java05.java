import java.util.Scanner;
public class java05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������n");
		int n = input.nextInt();
		int days = n/24;
		int hours = n-days*24;
		System.out.println(days+"����"+hours+"Сʱ");
	}
}