import java.util.Scanner;


public class Student {
	String name;
	int xuenum;
	int classs;
	String sex;
	int year;
	String address;
	public void sayHello(){
		Scanner ip=new Scanner(System.in);
		System.out.println("������ѧ��������");
		name=ip.next();
		System.out.println("������ѧ��ѧ�ţ�");
		xuenum=ip.nextInt();
		System.out.println("������ѧ���༶��");
		classs=ip.nextInt();
		System.out.println("������ѧ���Ա�");
		sex=ip.next();
		System.out.println("������ѧ�����䣺");
		year=ip.nextInt();
		System.out.println("������ѧ����ͥסַ��");
		address=ip.next();
		System.out.println("ѧ����Ϣ���£�");
		System.out.println("������"+name+"\n"+"ѧ�ţ�"+xuenum+"\n"+"�༶��"+classs+"\n"+"�Ա�"+sex+"\n"+"���䣺"+year+"\n"+"��ͥסַ��"+address);
	}
}
