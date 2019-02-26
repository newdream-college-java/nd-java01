// 编程实现输入的年份，月份，然后输出这一年的这一月月份的日历


import 	java.util.Scanner;

public class F{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		int month = input.nextInt();
		int sum = 0 ,day = 0 ,n=0;
		for(int i = 1900 ; i< year ;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				sum+=366;
			}else {
				sum+=365;
			}
		}
		for(int i = 1 ; i< month ; i++){
			if(i==4||i==6||i==9||i==11){
				n+=30;
			}else if(i==1||i==3||i==5||i==7||i==8||i==10){
				n+=31;
			}else if(year%4==0&&year%100!=0||year%400==0){
				n+=29;
			}else{
				n+=28;
			}
		}
		sum+=n+1;
		System.out.println("\t\t\t"+year+"年"+month+"月");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for(int i = 1; i<=sum%7;i++){
			System.out.print("\t");	
		}
		if(month==2){
			if(year%4==0&&year%100!=0||year%400==0){
				day = 29;
			}else {
				day=28;
			}
		}else if(month==4||month==6||month==9||month==11){
			day=30;
		}else{ 
			day=31;
		}
		for(int i = 1 ;i<=day ;i++){
			System.out.print(i+"\t");
			if((i+sum)%7==0){
				System.out.println();
			}
		}
		
	}
}