package java14;
import java.util.Scanner;
public class Ceshilei {
	public static void main(String[] args) {
		Gou gou=new Gou();
		Qqie qe=new Qqie();
		int bo;
		Scanner q=new Scanner("System.in");
		System.out.println("��ӭ��������꣡����");
		System.out.println("��������Ҫ�����ĳ�������");
		String name=q.next();
		System.out.println("��ѡ�������ĳ�������1��������2�����");
		bo=q.nextInt();
		if(bo==1){
			gou.setName(name);
			gou.show();
		}else if(bo==2){
			qe.setName(name);
			qe.show1();
		}else{
			System.out.println("ѡ�����");
		}
		//gou.show();
		//qe.show1();
	}
	
	

}
