import java.util.Scanner;
public class Zy11{
	public static void main(String[] aegs){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入用户名：fzq");
			
		System.out.print("请输入密码：123456");
			
		System.out.println("欢迎登录MyShopping系统");
		
		
		for(int i=3;i>=1;i--){
			System.out.print("请输入用户名：");
			String mz=input.next();
			System.out.print("请输入密码：");
			String mm=input.next();
			if(mz.equals("fzq")||mm.equals("123456")){
				break;
			}else{
				System.out.println("输入错误！您还有"+(i-1)+"机会");
			}if(i==1){
				System.out.print("对不起，您3次均输入错误");
			}
		}
		
	}
}