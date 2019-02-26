import java.util.Scanner;
public class java11{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		int j=3;
		int password;
		String name;
		for(int i =1;i<=3;i++){
			System.out.print("请输入用户名:");
			name = input.next();
			System.out.print("请输入密码:");
			password = input.nextInt();
			if((!name.equals("jim"))||(password!=123456)){
				j--;
				System.out.println("输入错误,您还剩下"+j+"次机会");
			}else{
				System.out.println("欢迎登陆MyShopping系统!");
				break;
			}
		}
	}

}