import java.util.Scanner;
public class Zy4{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请入一个数字：");		
		int a=input.nextInt();
		switch(a){
			case 1:
				System.out.println("星期一");				
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			default:
				System.out.println("输入错误");
				break;
		}
	}

}