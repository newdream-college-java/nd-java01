package zuoye;
import java.util.Scanner;
public class Zy3 {
	public static void main(String[] args) {
			// 要有一个管理员
		Scanner input=new Scanner(System.in);
			Zylei3 a=new Zylei3();
			//输入方式:1.扫描仪  2.读文件输入  3.数据库
			for (int i = 1; i <=5; i++) {	
				System.out.print("请输入第"+i+"个客户的名字");
				String name=input.next();
				a.b(name);
			}
			a.s();
			
		if(a.a(1,a.names.length)){
			}else{
				System.out.println("没找到");
			}
			
	}
}