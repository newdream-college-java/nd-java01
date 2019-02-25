import java.util.Scanner;
public class Qre{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("循环接受5名学生成绩单");
		//int a =input.nextInt();
		int h=0;
		int i=1;
		while(i<6&&i>=1){
			//h=h+a;
			System.out.println("请输入你的成绩");
			int a=input.nextInt();
			
			if(a>80){
				h=h+1;
				//System.out.println(a);
			}
				i++;

		}		System.out.println("大于80的人数\t"+h"位");
			
	}

}