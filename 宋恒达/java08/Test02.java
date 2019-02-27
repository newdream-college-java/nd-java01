/**
**循环接收5名学生的成绩，统计有多少人的成绩大于80分，要去使用continue语句完成
**/
import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum=0;  //用来统计大于80分的学生人数
		//循环接收5名学生成绩
		for(int i=1;i<=5;i++){
			System.out.print("输入第"+i+"名学生的成绩:");
			int a=input.nextInt();
			//统计大于80分的学生人数
			if(a<=80){
				continue;
			}
			sum++;
		}
		//输出大于80分的学生人数
		System.out.println();
		System.out.println("大于80分的学生人数为"+sum);
	}
}