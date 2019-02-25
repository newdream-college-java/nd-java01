import java.util.Scanner;
public class Asa{
	public static void main (String[]arga){
		Scanner input =new Scanner(System.in);
		System.out.println("请输入你的名字");
		String name =input.next();
		while(name.equals("不告诉你")){
			System.out.println("你叫什么名字");
			name=input.next();

		}	System.out.println("你的名字原来叫：name");

	}

}