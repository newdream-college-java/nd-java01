import java.util.Scanner;
public class Hw08{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("输入学生成绩：");
		//循环输入学生成绩
		double score=input.nextDouble();
		int i=1,rs=0;//设置统计人数的变量rs
		for(;i<5;i++){
			System.out.print("输入学生成绩");
			//循环输入学生成绩
			score=input.nextDouble();
			if(score>80){
				rs++;
			}else{
				continue;
				}
		}	
		System.out.print("有"+rs+"人成绩大于80分。");
	}
}