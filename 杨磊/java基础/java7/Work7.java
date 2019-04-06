import java.util.Scanner;
public class Work7{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		//1.确定年，月（输入）
		//int year=2019;
		System.out.print("请输入你要看的日历的年份：");
		int year  = input.nextInt();
		//int month = 2;
		System.out.print("请输入你要查看的月份：");
		int month = input.nextInt();
		
		int sum = 0;
		//2.计算总天数=整年的天数+整月的天数+1
		//2.1整年天数：1900+1901+....+1902+....+2017
		for(int i=1900;i<year;i++){
			if(i%4==0&&i%100!=0||i%400==0){//闰年
				sum+=366;
			}else{
				sum+=365;
			}
		}
		//2.2整月天数：2018年1月+2月+3月+....+12
		for(int i=1;i<month;i++){
			if(i == 2){//2月
				if(year%4==0&&year%100!=0||year%400==0){
					sum+=29;
				}else{
					sum+=28;
				}
			}else if(i==4||i==6||i==9||i==11){//小月
				sum+=30;
			}else{//大月
				sum+=31;
				
			}
		}
		//2.3 1号的一天，记得加上1
		sum+=1;
		//2.4 得到1号是星期几
		System.out.println(sum%7);
		
		//打印出万年历的表头
		System.out.println("\t\t"+year+"年"+month+"月\n");
		System.out.println("日\t一\t二\t三\t四\t五\t六");


		//打印出日期
		//4.1 确定1号的位置：一号是星期几就在前面打印多少个\t
		for(int i=1;i<=sum%7;i++){
			System.out.print("\t");
		}
		//4.2判断这个月有多少天
		int days = 0;
		if(month == 2){//2月
			if(year%4==0&&year%100!=0||year%400==0){
				days+=29;
			}else{
				days+=28;
			}
		}else if(month==4||month==6||month==9||month==11){//小月
				days+=30;
		}else{//大月
			days+=31;		
		}	
		//输出日期
		for(int i=1;i<=days;i++){
			System.out.print(i+"\t");
			if(sum%7==6){
				System.out.print("\n");
			}
			sum++;
		}
	}
}