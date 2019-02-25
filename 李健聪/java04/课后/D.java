import java.util.Scanner;
public class D{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("你的名字叫什么");
		String answer=input.next();
		while(answer.equals("不告诉你")){
			System.out.println("你的名字叫什么");
			answer=input.next();
			
		}System.out.println("你的名字原来叫："+answer);
		
	}
}