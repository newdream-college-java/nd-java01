package zuoye;
import java.util.*;
public class guanliyuan {
	Scanner input = new Scanner(System.in);
	String name;
	int passWord;
	public void show(){
		System.out.print("姓名："+name+"，");	
		System.out.print("密码"+passWord);
		System.out.println();
	}
	public void pan(){
		System.out.println("请输入用户名：");
		String b=input.next();
		System.out.println("请输入六位密码：");
		int a=input.nextInt();
		if(a==this.passWord){
			System.out.println("请输入新密码");
			passWord=input.nextInt();
			System.out.println("修改成功，你的新密码为"+passWord);
		}else{
			System.out.println("密码错误，你不知道密码你改个锤子！");
		}
	}
}
