import java.util.Scanner;
public class Z1 {
	public static void main(String[] args) {
		String a;
		CustomerBiz cb=new CustomerBiz();
		do{
			Scanner input=new Scanner(System.in);
			System.out.print("������ͻ�������:");
			String name=input.next();
			cb.show(name);
			System.out.print("����������(y/n):");
			a=input.next();
		}while(a.equals("y"));
		cb.showNames();
		
	}

}
