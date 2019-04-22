/*循环接收5名学生的成绩，统计有多少人的成绩大于80分，要求使用continue语句完成。*/
import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int a=0;
	for(int i=1;i<6;i++){
		System.out.print("请输入成绩：");
		int score=input.nextInt();
		if(score<=80){
			continue;
		}
		a++;
	}
	System.out.print("大于80分的有"+a+"个");
	}

}