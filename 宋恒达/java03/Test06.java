/**
**输入一个 int 型的数据，判断这个数是   否能被 2 整除，如果能被 2 整除， 
   那么输出“这个数是偶数”，否则输出“这个数是奇数”。 
**/
import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个整数:");
		int a=input.nextInt();
		if(a%2==0){
			System.out.println(a+"是偶数");
		}else{
			System.out.println(a+"是奇数");
		}		
	}
}