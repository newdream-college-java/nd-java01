import java.util.Scanner;
public class A{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数的阶乘");
		int sum=1;
		int a=input.nextInt();
		for(int i=1;i<=a;i++){
				
				if(!(a>=1&&a<=10)){
					System.out.print("a的输入有误");
					break;
					
				}else{
					sum*=i;
				}	System.out.println(a+"的阶乘为"+sum);
				
					
		}
	}
}