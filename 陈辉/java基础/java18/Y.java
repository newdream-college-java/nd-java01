package java18;
import java.util.Scanner;
public class Y {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入课程代号（1~3之间的数字）");		
		try {
			int a=input.nextInt();
			switch(a){
			case 1:
				System.out.println("C#编程");
				break;						
			case 2:
				System.out.println("JAVA编程");
				break;			
			case 3:
				System.out.println("SQL基础");
				break;
			default :
				System.out.println("输入数字不正确");
		}
		} catch (Exception e) {
			System.out.println("输入错误");
		}finally{
			System.out.println("欢迎提出建议");
		}

	}
}
