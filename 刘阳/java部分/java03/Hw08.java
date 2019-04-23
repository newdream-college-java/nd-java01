import java.util.Scanner;
public class Hw08{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入4位会员号：");
		int a =input.nextInt();
		if(a>+1000&&a<+9999){
			System.out.print(a+"号客户，谢谢您的支持！");
		}else{
			System.out.print("输入的会员号错误！");
		}
	}

}