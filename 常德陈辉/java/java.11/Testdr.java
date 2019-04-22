import java.util.Scanner;


public class Testdr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Dr dr=new Dr();
		dr.showLoginMenu();
		int a=input.nextInt();
		if(a==1){
			for (;;) {
				System.out.print("请输入用户名：");
				String name=input.next();
				System.out.print("请输入密码：");
				int mm=input.nextInt();
				if(name.equals(dr.name)&&mm==dr.mm){
					System.out.println("登入成功");
					break;
				}else{
					System.out.println("@@您没有权限登入系统，请重新登入。@@");
				}
			}
		}else{
			System.out.print("已退出");
		}
	}

}
