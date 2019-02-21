import java.util.Scanner;
public class hw03{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一个密码：");
		int pW01=input.nextInt();
		//System.out.print("请输入第二个密码：");
		//int pW02=input.nextInt();
		if(pW01==123456){
			System.out.print("请输入第二个密码：");
			int pW02=input.nextInt();
			if(pW02==654321){
				System.out.print("恭喜拿到钱了！");
			}else{
				System.out.print("第2道密码错误。");
			}
				
		}else{
			System.out.print("第一道密码错误！");
		}
			
	}

}