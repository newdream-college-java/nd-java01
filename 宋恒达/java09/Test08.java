/**
**输入10个学生的单科成绩，求成绩在60分以下、60~80分（含60分不含80）
**和80分以上的学生各有多少个？并求出最高分、最低分和平均分
**/
import java.util.Scanner;
import java.util.Arrays;
public class Test08{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//创建长度为10的数组
		int[] scores=new int[10];
		double sum=0;
		int count1=0;
		int count2=0;
		int count3=0;
		//输入10个学生的成绩并存入数组
		for (int i=0;i<scores.length ;i++ ) {
			System.out.print("请输入第"+(i+1)+"个学生的成绩:");
			int score=input.nextInt();
			scores[i]=score;
		}
		//统计在在60分以下、60~80分（含60分不含80）80分以上的学生学生人数
		//求出总分
		for (int i=0;i<scores.length ;i++ ) {
			if (scores[i]>=80) {
				count1++;
			}else if(scores[i]>=60){
				count2++;
			}else{
				count3++;
			}
			sum+=scores[i];
		}
		//排序
		Arrays.sort(scores);
		//输出
		System.out.println("60分以下人数为"+count3+",60~80分人数为"+count2+",80分以上为"+count1);
		System.out.println("最高分为"+scores[scores.length-1]+",最低分为"+scores[0]);
	}
}