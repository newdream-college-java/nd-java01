import java.util.Scanner;
public class Java01{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个正整数");
		int sum=1;
		int a=1;
		if(input.hasNextInt()==true){
			a =input.nextInt();
			if(a>0&&a<=10){
				for(int i=1;i<=a;i++){
					sum=sum*i;
				}
			}
		}

		System.out.print(a+"!=");
		for(;a>1;a--){
			System.out.print(a+"*");
		}
		System.out.print("1"+"="+sum);
	}
}