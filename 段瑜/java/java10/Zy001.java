package Zy10;
import java.util.Scanner;
public class Zy001 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Zy01 q=new Zy01();
		q.show();
		System.out.print("�������û�����");
		String c=input.next();
		System.out.print("���������룺");
		int s=input.nextInt();
		if(c.equals("admin1")&&s==q.b[0]){
			System.out.print("�����������룺");
			q.b[0]=input.nextInt();
			System.out.println("�޸�����ɹ�����������Ϊ��"+q.b[0]);
		}else if(c.equals("admint2")&&s==q.b[1]){
			System.out.print("�����������룺");
			q.b[1]=input.nextInt();
			System.out.println("�޸�����ɹ�����������Ϊ��"+q.b[1]);
		}else{
			System.out.println("�û��������벻ƥ�䣡��û��Ȩ�޸��¹���Ա��Ϣ��");
		}
	}
}
