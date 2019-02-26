//晚点再用if嵌套语句写一次
import java.util.Scanner;
public class A{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("\t登陆菜单(第一级)\n"+"1.登录系统\n"+"\t2.退出\n");	
		System.out.println("请输入相应的数字");
		int a=input.nextInt();
		switch(a){
			case 1:
			System.out.println("1.客户信息管理");
			System.out.println("2.购物结算");
			System.out.println("3.真情回馈");
			System.out.println("4.注销");
			int b=input.nextInt();
			switch(b){
				case 1:
				System.out.println("购物管理系统>客户信息管理");
				System.out.println("\t1.显示所有客户信息\n"+"\t2.添加客户信息\n"+"\t3.修改客户信息\n"+"\t4.查询客户信息\n");
				System.out.print("请输入1~4要执行的操作");
				int c=input.nextInt();
					switch(c){
						case 1:
						System.out.println("不好意思暂时能力不足没有下文");
						System.exit(-1);
						case 2:
						System.out.println("不好意思,还是暂时能力不足没有下文");
						System.exit(-1);
						case 3:
						System.out.println("不好意思又是暂时能力不足没有下文");
						System.exit(-1);
					}		
				case 2:
				System.out.println("不好意思暂时能力不足没有下文");
				System.exit(-1);
				case 3:
				System.out.println("不好意思,还是暂时能力不足没有下文");
				System.exit(-1);
				case 4:
				System.out.println("不好意思又是暂时能力不足没有下文");
				System.exit(-1);
			}
				
			case 2:
			System.out.print("谢谢您的使用");
			System.exit(-1);
			default:
			System.out.print("输入错误");
		}
	}
}