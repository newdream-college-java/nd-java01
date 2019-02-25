//计算今年1月1日到今天的总天数
//大月 31天 1 3 5 7 8 10 12	
//小月30  4 6 9 11
//平  28  闰年29											//待会用for循环
import java.util.Scanner;
public class F{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入年份");
		int year=input.nextInt();
		System.out.print("请输入今天多少号");
		int day=input.nextInt();
		int i=1,sum=0;
		while(i<2){
			if(i==1){
				sum+=31;		
				
			}
			if(i==2){
			if(year%4==0&&year%100!=0||year%400==0){
				sum+=29;
				
			}else{
				sum+=28;
				
			
			}
					
			}
		
			i++;	
		
		}
			
			System.out.print("一共"+(sum+day)+"天");	
}
}