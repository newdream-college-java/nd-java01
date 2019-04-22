
import java.util.Scanner;
public class Test11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		// TODO Auto-generated method stub
		Test01 gl=new Test01();
		Test12 gl2=new Test12();
		System.out.print("请输入用户名：");
		String name=input.next();
		System.out.print("请输入密码：");
		int mm=input.nextInt();
		if(name.equals(gl.name)&&mm==gl.mm||name.equals(gl2.name)&&mm==gl2.mm){
			System.out.println("请输入新密码：");
			gl.name=input.next();
			System.out.println("新密码修改成功，密码为："+gl.name);
		}else{
			System.out.println("用户名与密码不匹配！您没有权限更新管理员信息");
		}
	}

}
