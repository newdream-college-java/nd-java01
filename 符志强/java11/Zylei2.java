import java.util.Scanner;


public class Zylei2 {
	Scanner input=new Scanner(System.in);
	String name;
	int mm;
	public void denglu(){
		System.out.println("��ӭʹ���������ع���ϵͳ");
		System.out.println();
		System.out.println("1.��½ϵͳ");
		System.out.println();
		System.out.println("2.�˳�");
		System.out.println("*****************************************");
		System.out.print("��ѡ���������֣�");
		int a=input.nextInt();
		//boolean f=false;
		while(a!=123) {
			
			if (a==1) {
				System.out.print("�������û�����");
				int b=input.nextInt();
				System.out.print("���������룺");
				b=input.nextInt();
				zhu();
			}if (a==2) {
				break;
			}else{
				System.out.print("����������������룺");
				a=input.nextInt();
			}
		}
	}
	public void zhu() {
		System.out.println("�������ع���ϵͳ���˵�");
		System.out.println();
		System.out.println("1.�ͻ���Ϣ����");
		System.out.println();
		System.out.println("2.�������");
		System.out.println("*****************************************");
		System.out.print("��ѡ���������ֻ�0������һ�˵���");
		int b=input.nextInt();
		while(b!=147) {
			
			if (b==1) {
				guanli();
			}if (b==2) {
				huikui();
			}if (b==0) {
				denglu();
			} else{
				System.out.print("����������������룺");
				b=input.nextInt();
			}
		}
	}
	public void guanli() {
		System.out.println("��û��Ȩ�޽���ͻ�����ϵͳ");
		System.out.println("������ѡ��");
		zhu();
	}
	public void huikui() {
		System.out.println("�������ع���ϵͳ>�������");
		System.out.println();
		System.out.println("1.���˴����");
		System.out.println();
		System.out.println("2.���˳齱");
		System.out.println();
		System.out.println("3.�����ʺ�");
		System.out.println("*****************************************");
		System.out.print("��ѡ���������ֻ�0������һ�㣺");
		int c=input.nextInt();
		while(c!=258) {
			if (c==1) {
				System.out.println("ִ�����˴����");
			}if (c==2) {
				System.out.println("ִ�����˳齱");
			}if (c==3) {
				System.out.println("ִ�������ʺ�");
			}if (c==0) {
				zhu();
			}else{
				System.out.print("����������������룺");
				c=input.nextInt();
			}
		}				
	}
}
