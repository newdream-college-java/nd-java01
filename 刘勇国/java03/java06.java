import java.util.Scanner;
public class java06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������");
		int n = input.nextInt();
		if(n%2==0){
			System.out.println("�������ż��");
		}else{
			System.out.println("�����������");
		}
	}
}