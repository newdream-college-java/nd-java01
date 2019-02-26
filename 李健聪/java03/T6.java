import java.util.Scanner;
public class T6{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入张浩的java成绩");
		double score = input.nextDouble();
		if(score>98){
			System.out.print("老师奖励你一个MP4");
		}
		else{
			System.out.print("滚");
		}
	}
}
\*import java.util.Scanner;
public class T6{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入张浩的java成绩与音乐成绩");
		double score1=input.nextDouble();
		double score2=input.nextDouble();
		if((score1>98&&score2>80)||(score1==100&&score2>70)){
			System.out.println("张浩老师奖励你一个MP4");
		}else{
			System.out.println("张浩请继续加油哦");
		}
	}
}*\