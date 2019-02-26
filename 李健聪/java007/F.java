import java.util.Scanner;
public class F{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int os=0,js=0;
		System.out.println("输入一个整数，统计1到它本身有多少个奇数和偶数");
		int a=input.nextInt();
		for(int i=1;i<=a;i++){
			if(i%2==0){
			os++;
			}if(i%2==1){
			js++;
			}
		}System.out.println(a+"中有"+js+"个奇数\t偶数有"+os+"个");

	}
}