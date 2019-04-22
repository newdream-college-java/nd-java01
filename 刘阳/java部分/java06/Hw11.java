import java.util.Scanner;
public class Hw11{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i =1;
		for(;i<=3;i++){
			System.out.println("请输入用户名：");
		String name=input.next();
		System.out.println("请输入密码：");
		int code=input.nextInt();
			if(name.equals("jim")&&code==123456){
				System.out.println("欢迎登录MyShopping系统!");
				System.exit(-1);
			}else if(!name.equals("jim")||code!=123456){
				System.out.println("输入错误！您还有"+(3-i)+"次机会!");
			}
			if(i==3){
				System.out.print("\n");
				System.out.println("对不起，您3次均输入错误！");
			}	
		}
		
	}
}
 