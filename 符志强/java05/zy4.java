import java.util.Scanner;
public class zy4{
	public static void main(String[] args){
		System.out.println("请输入你的名字");
		Scanner input=new Scanner(System.in);
		String name=input.next();
		while(name.equals("不告诉你")){
			System.out.println("请输入你的名字");
			 name=input.next();
		}
		System.out.println("你的名字原来叫："+name);
	}
}