import java.util.Scanner;
public class C03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入第一道密码：");
		int mi=input.nextInt();
		int dy=123456,de=654321;
		if(mi==dy){
			System.out.print("请输入第二道密码：");
			int me=input.nextInt();
			if(me==de){
				System.out.print("密码正确");

			}else{

				System.out.print("第二道密码错误");

			}		

		}else{
			System.out.print("第一道密码错误");
			
		}



	}



}
