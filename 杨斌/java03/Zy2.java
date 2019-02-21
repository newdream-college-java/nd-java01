import java.util.Scanner;
public class Zy2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("输入一个年份：");
		int y=input.nextInt();
		if(y%4==0&&y%100!=0||y%400==0){

			System.out.print("闰年");
		}else{

			System.out.print("平年");
		}

		
	}



}