/**
**循环输入字符串，将这些输入的字符串都连接起来，直到输入的字符串为“Esc”就结束循环，最后显示这个
**连接起来的字符串
**比如：输入abc 输入def 输入Esc
**就输出abcdef
**/
import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String last="";
		while(true){
			System.out.print("请输入字符串:");
			String a=input.next();
			if(a.equals("Esc")){
				break;
			}
			last=last+a;
		}
		System.out.println(last);
	}
}