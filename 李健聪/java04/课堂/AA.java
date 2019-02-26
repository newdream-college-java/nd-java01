import java.util.Scanner;
public class AA{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		int sum=0;
		double avg;
		
		for(int i=1;i<=5;i++){
			System.out.println("请输入您的成绩");
			int a=input.nextInt();
			sum=sum+a;
			
		}
			System.out.println("平均成绩为"+(avg=sum/5));
	}
}