import java.util.Scanner;
public class Hw01{
	Scanner input=new Scanner(System.in);
	String name;
	String code;
	public void show(){
		System.out.println("姓名："+name+"，密码："+code);
	}
	public void change(){
		//要求输入旧用户名
		System.out.println("请输入用户名：");
		String name01=input.next();
		System.out.println("请输入密码：");
		//要求输入密码
		String code01=input.next();
		System.out.println("\n");
		if(name01.equals(this.name)&&code01.equals(this.code)){
			//提示输入新密码
			System.out.print("请输入新密码：");
			String newcode=input.next();
			System.out.println("修改密码成功，您的新密码为："+newcode);
			System.exit(-1);
		}else{
			System.out.println("用户名和密码不匹配！您没有权限更新管理员信息。");
			System.exit(-1);
		}
	}
} 
