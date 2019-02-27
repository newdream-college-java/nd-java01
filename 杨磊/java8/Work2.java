//循环接受五名学生的成绩，统计有多少个人的成绩大于80，要求使用continue语句完成
import java.util.Scanner;
public class Work2{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int count=0;
		for(int i=1;i<=5;i++){
			System.out.print("请输入第"+i+"位同学的成绩：");
			double a=input.nextDouble();
			if(a<=80){
				continue;
			}
			count++;
		}	
			System.out.print("大于80分的同学有"+count+"位");
	}
}