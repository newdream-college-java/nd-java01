import java.util.Scanner;
public class E{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("您的成绩是否合格");
		String answer =input.next();
		while(answer.equals("不合格")){
			System.out.println("商务阅读教材，学习理论，下午编程，掌握代码");
			System.out.println("您的成绩是否合格");
			 answer =input.next();
		}
	}	
}