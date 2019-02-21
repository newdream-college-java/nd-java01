import java.util.Scanner;
public class H{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入第一道密码：");
		int a=input.nextInt();
		int b=135790,c=246810;
		if(a==b){
			System.out.println("请输入第二道密码：");
			int d=input.nextInt();
			if(d==c){
				System.out.println("恭喜你拿到钱了！！！");
			}else{
				System.out.println("第二道密码错误！");
			}
			}else{
				System.out.println("第一道密码错误！");
			}
		}
}