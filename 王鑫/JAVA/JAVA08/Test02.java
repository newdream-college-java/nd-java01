//循环接收五名学生的成绩，统计有多少人的成绩大于80分，要求使用continue语句完成

import java.util.Scanner;

public class Test02{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		int count = 0;
		for(int i = 1 ; i <= 5 ; i++){
			int scort = input.nextInt();
			if(scort>80){
				count++;
			}
		}
		System.out.print(count);
	}
}