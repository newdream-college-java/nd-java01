import java.util.Scanner;
public class T11{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个数字");
		int num = input.nextInt();
		switch(num){
		case 0:
			System.out.println("你是小鲜肉");
			break;
		case 1:
			System.out.println("你是老腊肉");
			break;
		case 2: 	
			System.out.println("你是死猪肉");
			break;
		default:
			System.out.println("你是什么肉");
		}
	}
}