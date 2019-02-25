/**
**循环接收5名学生的成绩，统计有多少人的成绩大于80分，要求使用continue语句完成
**/
import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<5;i++){
			System.out.println("请输入第"+(i+1)+"个学生的成绩");
			int a=input.nextInt();
			if(a<=80){
				continue;
			}
			sum++;
		}
		System.out.println("有"+sum+"个人的成绩大于80");
	}
}