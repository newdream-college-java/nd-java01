/*现在有一个银行保险柜，有两道密码。想拿到里面的钱必须两次输入密码都要正确。如果第一道密码都不正确，那么直接把你拦在外面；如果第一道密码输入正确，才能有权限输入第二道密码。只有当第二道密码也输入正确，才能拿到钱！（两道密码自己设，要求密码长度不能低于6位）*/
import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("请输入密码");
	int a=input.nextInt();
	//int c=123456;
	//int d=234567;
	if(a==123456){
		System.out.print("请输入第二道密码");
		int b=input.nextInt();
		if(b==234567){
			System.out.print("密码正确");
			}else
		System.out.print("密码错误");
        	}else
		System.out.print("密码错误");
	}
}