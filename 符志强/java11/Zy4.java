import java.util.Scanner;
public class Zy4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Zylei4 s=new Zylei4();
		System.out.print("清输入一个数");
		s.y1=input.nextInt();
		System.out.print("请输入一个运算符");
		s.f=input.next();
		System.out.print("请输入一个数");
		s.y2=input.nextInt();
		s.jisuanqi();

	}

}
