import java.util.Scanner;
public class Zy1lei {
	Scanner input=new Scanner(System.in);
	String name;
	String mima;
	public void show(){
		System.out.print("�������û�����");
		String b=input.next();
		System.out.print("�������û������룺");
		String c=input.next();
		boolean g=false;
		while(g!=(true)){
			if(!b.equals("abc")||!c.equals("111111")){
				System.out.println("�����û��������������������������");
				System.out.print("�������û�����");
				b=input.next();
				System.out.print("�������û������룺");
				c=input.next();
			}else{
				System.out.print("��������������룺");
				String x=input.next();
				System.out.println("���ĳɹ������������ǣ�"+x);
				g=true;
			}
		}
	}
}
