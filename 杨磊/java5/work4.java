import java.util.*;
public class work4{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		String n="不告诉你";
		while(n.equals("不告诉你")){
			System.out.print("你的名字叫什么？");
			n=input.next();
		}
		System.out.print("原来你的名字叫："+n);
	}
}