import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入您的成绩");
		double score = input.nextDouble();
		if(score>90){
			System.out.println("奖励MP4一个");
		}

	}
}