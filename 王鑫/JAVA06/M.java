// 循环输入大于0的数字进行累加，知道输入0结束，并输出。

import java.util.Scanner;
public class M{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		for(int i = 1;i<=5;i++){
			System.out.println("请输入第"+i+"学生成绩：");
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			if(a<80||b<80||c<80){
				continue;
			}
			System.out.println("该学生三门成绩大于80分！");
		}
	}
}