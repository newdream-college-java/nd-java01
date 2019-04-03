// 连接字符串，ESC结束

import java.util.Scanner;
public class B{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入你要录入的字符串（ESC结束）：");
		String s = "",n;
		for(;;){
			n = input.next();
			if(!n.equals("ESC")){
				s+=n;
			}else{
				break;
			}
		}
		System.out.print(s);
	}
}