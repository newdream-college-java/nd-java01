import java.util.Scanner;
public class Hw01{
	Scanner input=new Scanner(System.in);
	String name;
	String code;
	public void show(){
		System.out.println("������"+name+"�����룺"+code);
	}
	public void change(){
		//Ҫ��������û���
		System.out.println("�������û�����");
		String name01=input.next();
		System.out.println("���������룺");
		//Ҫ����������
		String code01=input.next();
		System.out.println("\n");
		if(name01.equals(this.name)&&code01.equals(this.code)){
			//��ʾ����������
			System.out.print("�����������룺");
			String newcode=input.next();
			System.out.println("�޸�����ɹ�������������Ϊ��"+newcode);
			System.exit(-1);
		}else{
			System.out.println("�û��������벻ƥ�䣡��û��Ȩ�޸��¹���Ա��Ϣ��");
			System.exit(-1);
		}
	}
} 
