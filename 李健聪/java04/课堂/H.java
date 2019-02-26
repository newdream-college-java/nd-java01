import java.util.Scanner;
public class H{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个整数");
		int max=input.nextInt();
		int i=2;
		while(i<6){
			System.out.println("请输入第"+i+"个数字");
			int number=input.nextInt();
			if(max<number){
				max=number;
			}
			i++;
		}
			System.out.println("五个整数中最大值为"+max);
			
	}		
}