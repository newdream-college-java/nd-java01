import java.util.Scanner;
public class F{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("输入年");
		int year=input.nextInt();
		System.out.println("输入月份");
		int smonth=input.nextInt();
		System.out.println("输入日期");
		int date=input.nextInt();
		int sum=0;
		int i=smonth;
		while(i<=smonth){
			if(i==2){
				if(year%4==0&&year%100!=0||2019%400==0){
					sum+=29;
				}else{
					sum+=28;
				}
			}else if(i==4||i==6||i==9||i==11){
				sum+=30;
			}else{
				sum+=31;
			}
			i++;
		}
		sum=sum+date;
		System.out.println("今年一月一号到今天的总天数为："+sum);
		

	}
}