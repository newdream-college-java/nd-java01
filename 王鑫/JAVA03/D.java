/*输出“你爱爱我吗？”，如果回答是“yes”，则输出“你是爱我的”，如果回答的是“no”，
则输出的“原来你不爱我”，如果回答的是其他的，则输出“你到底是爱还是不爱，自己心里也不清楚”。
*/

import java.util.Scanner;

public class E{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		System.out.print("你爱我吗（yes/no）：");
		String str = input.next();
		if(str.equals("yes")){
			System.out.print("你是爱我的");
		}else if(str.equals("no")){
			System.out.print("原来你不爱我");
		}else{
			System.out.print("你到底是爱还是不爱，自己心里也不清楚");
			}
	}
}