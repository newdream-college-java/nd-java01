//输入3件套
import java.util.Scanner;
public class Demo{
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int a =input.nextInt();
		int sum =1;
		if(a>=1&&a<=10){
			for(int i=1;i<=a;i++){
				//int sum = 1;//定义一个用来存储阶层的值
		
				for(int j=1;j<=i;j++){//实现阶层的循环

					sum *= j;
				
				}	if(i!=1&&i>=11){
						System.out.println("输入错误");
					}
			
						System.out.println(i+"的阶层是："+sum);
			}
						//System.out.println(i+"的阶层是："+sum);
		}

	


	}




}	