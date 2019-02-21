import java.util.Scanner;
public class E{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个年份：");
		int mun=input.nextInt();
		if(mun%4==0&&mun%100!=0||mun%400==0){
			System.out.println(mun+"这一年是闰年");
		}else{
			System.out.println(mun+"这一年是平年");
			}
	}
}