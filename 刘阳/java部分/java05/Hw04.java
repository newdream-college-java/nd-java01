import java.util.Scanner;
public class Hw04{
	public static void main(String[] arg){
		Scanner input=new Scanner(System.in);
		System.out.print("你的名字叫什么？");
		String name=input.next();
		while(name.equals("不告诉你")){
			System.out.print("你的名字叫什么？");
			name=input.next();
		}
		System.out.print("原来你的名字叫："+name);
	}
}