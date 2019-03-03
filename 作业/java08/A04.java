import java.util.Scanner;
public class Java04{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int zheng = 0;
		int fu = 0;
		Boolean flag = true;
		while(flag){
			System.out.println("请输入数字");
			double a = input.nextDouble();
			if(a>0){
				zheng++;
			}else if(a<0){
				fu++;
			}
			if(a==999){
				break;
				
			}
		}
		System.out.println("正数共有"+zheng+"\t\t负数共有"+fu);
	}
}
