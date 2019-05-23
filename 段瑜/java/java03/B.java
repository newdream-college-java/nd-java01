import java.util.Scanner;
public class B{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("请输入一个整数");
	int mun=input.nextInt();
	if(mun%2==0){
		System.out.println("这个数是偶数");
	}else{
		System.out.println("这个数是奇数");
	}
	}
}