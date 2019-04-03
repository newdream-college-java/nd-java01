package Test2019_2_28;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		int[] arr = new int[3];
		System.out.println("请输入10个学生的成绩");
		System.out.print("请输入第"+1+"个学生的成绩:");
		int n = input.nextInt();
		int max=n,min=n,aver=n;;
		for (int i = 1; i < 10; i++) {
			if (n>max) {
				max=n;
			}else if (n<min) {
				min = n;
			}
			if (n<60) {
				arr[0]++;
			}else if (n<80) {
				arr[1]++;
			}else {
				arr[2]++;
			}
			System.out.print("请输入第"+(i+1)+"个学生的成绩:");
			n = input.nextInt();
			aver+=n;
		}
		System.out.println("60分以下 ："+arr[2]+"\t60-80："+arr[1]+"\t80+:"+arr[0]);
		System.out.println("max="+max+"\tmin"+min+"\tvaer:"+(aver/10.0));
	}
}
