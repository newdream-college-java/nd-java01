package zuoye;
import java.util.Scanner;
public class Admin {
	String name;
	int mm;
	public void show(){
		System.out.println("����:"+name+"������:"+mm);
	}
	public void gm(){
		Scanner input=new Scanner(System.in);
		System.out.print("�������û���:");
		String a=input.next();
		System.out.print("����������:");
		int b=input.nextInt();
		if(a.equals(name)&&b==mm){		
			System.out.println("������������:");
			int c=input.nextInt();
			mm=c;
			System.out.println("�޸ĳɹ�������������Ϊ��"+mm);
		
		}else{
			System.out.println("�û��������벻ƥ�䣡��û��Ȩ�޸��¹���Ա��Ϣ��");
		}
	}
}
