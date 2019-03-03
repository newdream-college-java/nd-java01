import java.util.Scanner;
public class Java06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int n= input.nextInt();
		int ji=0;
		int ou=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				ou++;
			}else{
				ji++;
			}
		}
		System.out.println("奇数共有"+ji+"个\t\t"+"偶数共有"+ou+"个");
	}
}