package java14;
import java.util.Scanner;
public class Ceshilei {
	public static void main(String[] args) {
		Gou gou=new Gou();
		Qqie qe=new Qqie();
		int bo;
		Scanner q=new Scanner("System.in");
		System.out.println("欢迎来到宠物店！！！");
		System.out.println("请输入你要领养的宠物名字");
		String name=q.next();
		System.out.println("请选择领养的宠物类型1：狗狗，2：企鹅");
		bo=q.nextInt();
		if(bo==1){
			gou.setName(name);
			gou.show();
		}else if(bo==2){
			qe.setName(name);
			qe.show1();
		}else{
			System.out.println("选择错误");
		}
		//gou.show();
		//qe.show1();
	}
	
	

}
