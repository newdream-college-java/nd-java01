import java.util.Scanner;
public class T7{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ������");
		int num = input.nextInt();
		if(num%2==0){
			System.out.print(num+"��ż��");
		}else{
			System.out.print(num+"������");
		}
	}
}