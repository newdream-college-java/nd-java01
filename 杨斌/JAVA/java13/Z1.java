import java.util.Scanner;
public class Z1 {
	public static void main(String[] args) {
		String a;
		CustomerBiz cb=new CustomerBiz();
		do{
			Scanner input=new Scanner(System.in);
			System.out.print("请输入客户的姓名:");
			String name=input.next();
			cb.show(name);
			System.out.print("继续输入吗(y/n):");
			a=input.next();
		}while(a.equals("y"));
		cb.showNames();
		
	}

}
