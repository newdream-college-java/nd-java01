/*循环接受五名学生的成绩，统计有有多少人的成绩大于80分，要求使用continue的语句完成。*/
import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int num=0;
	for(int i=1;i<6;i++){
		System.out.print("第"+i+"名学生的成绩:");
		int score=input.nextInt();
		if(score<80){
			continue;
			}
		num++;
		}
	System.out.print(num+"个成绩大于80分");
	}

}