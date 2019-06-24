import java.util.Scanner;
public class Demp {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String a =input.next();//输入
		String b ="";
		while(!a.equals("esc")){
			System.out.println(a);
			a =input.next();
			System.out.println("请在次输入"+a);//输出
			if(a.equals("esc")){
				System.out.println(b);
			}	//System.out.println("abcdef");
		}

	}
}