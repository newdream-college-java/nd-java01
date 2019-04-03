/*
现在有一个银行保险柜，有两到密码。想拿到里面的钱必须输入两次密码都要正确。
如果第一道密码都不正确，那直接把你拦在外面；只有在两道密码都输入正确才能拿到钱（假设两个密码都是自己设置，要求密码长度不能低于6位）
*/
import java.util.Scanner;
public class C{
	public static void main(String[] arge){
		System.out.print("请输入第一个密码:");
		Scanner input = new Scanner(System.in);
		int password1=input.nextInt(),password2;
		if(password1==123456){
			System.out.print("\n请输入第二个密码：");
			password2 = input.nextInt();
			if(password2==654321){
				System.out.print("密码输入正确！！！");
			}else System.out.print("密码输入错误");
		}else{
			System.out.print("密码输入错误");
		}
	}
}