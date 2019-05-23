import java.util.Scanner;
public class Test7{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int a=0,b=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				a+=1;
			}else{
				b+=1;
			}
		}
		System.out.println("奇数的个数为："+b+"偶数的个数为："+a);
	}
}