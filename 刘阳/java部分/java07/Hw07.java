import java.util.Scanner;
public class Hw07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//1.确定年、月(输入)
		System.out.print("请输入你要查看的日历的年份");
		int year=input.nextInt();
		System.out.print("请输入你要查看的日历的月份");
		int month=input.nextInt();
		int sum=0;
		//计算总天数=整年的天数+整月的天数+1
		//整年的天数：
		for(int i=1900;i<year;i++){
			if(i%4==0&&i%100!=0||i%400==0){//闰年
				sum+=366;
			}else{
				sum+=365;
			}
		}
		//计算整月的天数；
		for(int i=1;i<month;i++){
			if(i==2){
				if(year%4==0&&year%100!=0||year%400==0){
					sum+=29;
				}else{
					sum+=28;
				}
			}else if(i==4||i==6||i==9||i==11){
				sum+=30;
			}else{
				sum+=31;
			}
		}
		sum+=1;//1号的那一天加起来。
		//打印出万年历的表头
		System.out.println("\t\t"+year+"年"+month+"月\n");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		//打印出日期
		//确定一号的位置，是星期几就在前面打印多少个\t
		for(int i=1;i<=sum%7;i++){
			System.out.println("\t");	
		}
		//判断这个月是大月是小月还是二月，从而知道这个月的上限是多少天
		int days=0;
		if(month==2){
			if(year%4==0&&year%100!=0||year%400==0){
				days=29;
			}else{
				days=28;
			}
		}else if(month==4||month==6||month==9||month==11){
			days=30;
		}else{
			days=31;
		}
		//输出日期
		for(int i=1;i<=days;i++){
			System.out.print(i+"\t");
			if(sum%7==6){
				System.out.println();
			}
			sum++;
		}
	}	
}
