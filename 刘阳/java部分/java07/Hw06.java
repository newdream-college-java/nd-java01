\*输入一个整数n，统计1到n中有多少个奇数多少个偶数*\
import java.util.Scanner;
public class Hw06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int count=0;
		System.out.println("请输入一个整数：");
		int n=input.nextInt();
		for(int i=1;i<=n;i++){
			if(i%2==0){
				count++;
			}else{
				continue;
			}
		}
		System.out.print("1~"+n+"中有"+count+"个偶数和"+(n-count)+"个奇数");
	}	
}