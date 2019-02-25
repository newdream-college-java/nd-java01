import java.util.Scanner;
public class J{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i=2;
		int c=123456;
		while(i>=0&&i<3){
			System.out.println("请输入用户名："); 
			String b=input.next();
			System.out.println("请输入密码：");
			int sum=input.nextInt();
			if(b.equals("jim")&&c==sum){
				System.out.println("欢迎登陆MyShopping系统！");
				i=0;
			}else if(i==0){
				System.out.println("对不起，您3次均输入错误！");
				i--;
			}else{
				System.out.println("输入错误！您还有"+i+"机会");
				i--;
			}
			
		}
	}
}