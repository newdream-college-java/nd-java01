import java.util.Scanner;
public class Hw09{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入顾客的年龄");
		//循环输入顾客年龄
		int yo=input.nextInt();
		int i,a=0;//30岁以上的人数
		for(i=1;i<10;i++){
			if(yo>=30){
				a++;
			}
			System.out.print("请输入顾客的年龄");
			yo=input.nextInt();
		}
		System.out.print("30岁以下的比例是："+(10-a)/10.0*100+"%"+"\n"+"30岁以上的比例是："+(a/10.0*100)+"%");
	}
}










