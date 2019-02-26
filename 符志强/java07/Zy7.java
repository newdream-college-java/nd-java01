/*
关键1：确定这一年这一月的1号是星期几？
常识：1900-01-01是星期一
关键2：确定这一年这一月有多少天？
判断这个月是大月还是小月,还是2月--就能得到这个月的天数
计算总天数=整年的天数+整月的天数+1
*/
import java.util.Scanner;
public class Zy7{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入年");
		int year=input.nextInt();
		System.out.println("请输入月");
		int month=input.nextInt();
		int sum=0;
		int y=0;	
		for(int i=1900;i<year;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				sum+=366;
			}else{
				sum+=365;
			}
		}
		for(int i=1;i<month;i++){
			if(i==2){
				if(year%4==0&&year%100!=0||year%400==0){
					y+=29;
				}else{
					y+=28;
				}
			}
			if(i==4||i==6||i==9||i==11){
				y+=30;
			}else{
				y+=31;
			}
		}
		sum=sum+y+1;
		
		//System.out.println(sum%7);	星期几
		System.out.println("\t\t\t"+year+"年"+month+"月");
		System.out.println();
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for(int i=1;i<=sum%7;i++){
			System.out.print("\t");
		}
	
		int r=0;
		if(month==2){
			if(year%4==0&&year%100!=0||year%400==0){
				r=29;
			}else{
				r=28;
			}
		}else
		if(month==4||month==6||month==9||month==11){
			r=30;
		}else{
			r=31;
		}
		for(int i=1;i<=r;i++){
			System.out.print(i+"\t");
			if(sum%7==6){
				System.out.print("\n");
			}
			sum++;
		}	
	}
}