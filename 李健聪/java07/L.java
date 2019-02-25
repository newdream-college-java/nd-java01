import java.util.Scanner;
public class L{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		for(int i=3;i>0;i--){
			System.out.print("请输入您的用户名:");
			String a=input.next();
			System.out.print("请输入您的密码:");
			String b=input.next();
			if(a.equals("jim")&&b.equals("123456")){
				System.out.println("欢迎登陆MyShopping");
				break;
			}else{
				System.out.println("输入错误！您还有"+(i-1)+"次机会");
			}if(i<=1){
			System.out.println("对不起，您3次均输入错误!");
			}
		}
	}
}