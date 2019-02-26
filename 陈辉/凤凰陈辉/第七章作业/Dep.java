import java.util.Scanner;
public class Dep{
	public static void main (String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个整数");
		int a=input.nextInt();
		int q=0,o=0;
		for(int i =1;i<=a;i++){
			if(i%2==0){
				o++;
			}else{
				q++;
			}//System.out.println("偶数为："+o+"奇数为："+q);

		}	System.out.println("偶数为："+o+"奇数为："+q);

		
	}
}