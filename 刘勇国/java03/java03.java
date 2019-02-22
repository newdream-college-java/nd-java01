import java.util.Scanner;
public class java03{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int passWord1 = 123456;
	int passWord2 = 654321;
	System.out.println("请输入第一道密码");
	int inputPassWord1 = input.nextInt();
	if(inputPassWord1==passWord1){
		System.out.println("请输入第二道密码");
		int inputPassWord2 = input.nextInt();
		if(inputPassWord2==654321){
			System.out.println("你拿到了钱");
		}else{
			System.out.println("第二道密码错误");
		}
	}else{
		System.out.println("第一道密码错误");
	}
	}
}