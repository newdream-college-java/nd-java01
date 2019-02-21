import java.util.Scanner;
public class C{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入您的密码");
		int s=input.nextInt();
		int a=123456,b=123789;
		if(s==a){
			System.out.print("第一个密码通过验证，请输入您的第二个密码");
			int d=input.nextInt();
			if(d==b){
				System.out.print("第二个密码验证通过，您可以进行存取款操作了");
				
			}else {
				System.out.print("不好意思哦，您的第二个密码错误，请从头开始");
			}
			
		}else{
				System.out.print("密码错误请重新开始");
			}
	}
		
}
