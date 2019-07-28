import java.util.Scanner;
public class Zy10{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);	
		for(int i=2;0<=i&&i<3;i--){
			System.out.println("请输入用户名：");
			String a=input.next();
			System.out.println("请输入密码：");
			int b=input.nextInt();
			if(a.equals("jim")&&b==123456){
				System.out.println("欢迎登陆MyShopping系统！");
				break;
			}else if(i==0){
				System.out.println("输入错误！您还有"+i+"次机会");
				System.out.println("对不起，您三次均输入错误！");
			}else{

				System.out.println("输入错误！您还有"+i+"次机会");
	
			}
		
			
			
						
		}
	
	}
		
}