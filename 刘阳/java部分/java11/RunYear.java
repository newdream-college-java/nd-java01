import java.util.Scanner;


public class RunYear {
	public void runYear(){
		Scanner ip=new Scanner(System.in);
		//提示输入年份
		System.out.println("请输入待查年份：");
		int year=ip.nextInt();
		if(year%4==0&&year%100!=0||year%400==0){
			System.out.print(year+"是闰年");
		}else{
			System.out.println(year+"不是闰年");
		}
	}
}
