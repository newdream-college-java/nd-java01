import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("\t欢迎使用我行我素购物管理系统");
	System.out.println("\n\n\t\t1.登录系统\n\n\t\t2.退出");
	System.out.println("\n\n* * * * * * * * * * * * * * * * * * * * * * *");
	int a=input.nextInt();
	if(a==1){
		System.out.println("1.客户信息管理");
		System.out.println("2.购物清单");
		System.out.println("3.真情回馈");
		System.out.println("4,注销");
		}else{
			System.out.print("已退出");
		}
	}

}