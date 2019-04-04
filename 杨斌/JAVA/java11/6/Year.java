import java.util.Scanner;
public class Year {
	int year;
	public void show(){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入年份:");
		year=input.nextInt();
		if(year%4==0&&year%100!=0||year%100==0){
			System.out.print(year+"年是闰年");
		}else{
			System.out.print(year+"年是平年");
		}
	}
}
