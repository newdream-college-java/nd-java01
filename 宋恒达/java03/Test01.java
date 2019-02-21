/**
**输入一个三位整数，判其是不是降序数如:531 是降序数  百位>十位>个位 
**/
import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个三位整数");
		int a=-1;
		while(true){
			if(input.hasNextInt()){
				a=input.nextInt();
				break;
			}
			else{
				System.out.println("输入的不是三位整数，请重新输入");
			}
		}
		int b=a%10;
		int c=a/10%10;
		int d=a/100;
		if((d>c)&&(c>b)){
			System.out.println(a+"是一个降序数");
		}else{
			System.out.println(a+"不是一个降序数");
		}					
	}
}