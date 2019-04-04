import java.util.Scanner;
public class Z3 {
	public static void main(String[] args) {
		Student stu=new Student();
		for(int i=0;i<stu.names.length;i++){
			Scanner input=new Scanner(System.in);
			System.out.print("请输入客户的姓名:");
			String name=input.next();
			stu.show(name);
		}
		stu.showNames();
		stu.gg();
		
	}

}
