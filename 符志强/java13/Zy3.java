package zuoye;
import java.util.Scanner;
public class Zy3 {
	public static void main(String[] args) {
			// Ҫ��һ������Ա
		Scanner input=new Scanner(System.in);
			Zylei3 a=new Zylei3();
			//���뷽ʽ:1.ɨ����  2.���ļ�����  3.���ݿ�
			for (int i = 1; i <=5; i++) {	
				System.out.print("�������"+i+"���ͻ�������");
				String name=input.next();
				a.b(name);
			}
			a.s();
			
		if(a.a(1,a.names.length)){
			}else{
				System.out.println("û�ҵ�");
			}
			
	}
}