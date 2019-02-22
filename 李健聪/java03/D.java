import java.util.Scanner;
public class D{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("你爱我吗？");
		String hd =input.next();
		switch(hd){
			case "yes":
				System.out.println("你是爱我的");
				break;
			case "no":
				System.out.println("原来你不爱我");
				break;
			default:
				System.out.println("我不知道你爱不爱我");
			
		}
	}
}