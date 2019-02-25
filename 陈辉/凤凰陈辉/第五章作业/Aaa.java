import java.util.Scanner;
public class Aaa{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入0至2之间的整数");
		int  a = input.nextInt();
		while(a>=0&&a<3){
			if(a==0){
				System.out.println("出石头");
				break;
			} if(a==1){
				System.out.println("是剪刀");
				break;

				}if(a==2){
				System.out.println("是布");
				break;
			}

			


		}		System.out.println("结束程序");
			

	}		

}