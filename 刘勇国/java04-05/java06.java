import java.util.Scanner;
public class java06{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int sum=0;
	int xy=0;
	int dy=0;
	System.out.println("请输入今天的年份");
	int year = input.nextInt();
	System.out.println("请输入今天的月份");
	int month = input.nextInt();
	System.out.println("请输入今天的日期");
	int day = input.nextInt();
	//闰年
	if((year%4==0&&year%100!=0)||(year%400==0)){
		System.out.println("今年是闰年，2月有29天");
		if(month>2){
			for(int i=1;i<month;i++){
				if(i==1||i==3||i==5||i==7||i==8||i==10)//大月共有xy个
				dy+=1;
			}
			System.out.println("到今天共有"+(30*(month-1)+day+dy-1));
		}else if(month==1){
			System.out.println("到今天共有"+day+"天");
		}else if(month==2){
			System.out.println("到今天共有"+(31+day)+"天");
		}
	}else{
		System.out.println("今年是平年");
		if(month>2){
			for(int i=1;i<month;i++){
				if(i==1||i==3||i==5||i==7||i==8||i==10)//大月共有xy个
				xy+=1;
			}
			System.out.println("到今天共有"+(30*(month-1)+day+xy-2)+"天");
		}else if(month==1){
			System.out.println("到今天共有"+day+"天");
		}else if(month==2){
			System.out.println("到今天共有"+(31+day)+"天");
		}
	}
	}
}