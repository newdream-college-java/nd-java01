import java.util.Scanner;
public class T9{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入您的成绩");
		double score=input.nextDouble();
		if(score>=80){
			System.out.println("你的成绩很优秀");
		}else if(score>=60){
			System.out.println("您的成绩一般般");
		}else 	System.out.println("您的成绩真垃圾");
	}
}