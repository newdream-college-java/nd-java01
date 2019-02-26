import java.util.Scanner;
public class Z6{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个大于0的整数：");
		int n=input.nextInt();
	 	int os=0,js=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				os++;
			}else{
				js++;
			}
			
		}
		System.out.print("1到"+n+"中有"+js+"个奇数"+os+"个偶数");
	}
}