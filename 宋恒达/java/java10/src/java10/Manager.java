package java10;

import java.util.Scanner;

/**
 * ��д����Ա�࣬�����ԣ��û��������룻������show()��ʾ����Ա��Ϣ��
 * 1.������������Ա�࣬������ǵ������Ϣ
 * 2.����ɵ��û��������룬�����ȷ������Ȩ�޸��£��Ӽ��̻���µ����룬���и���
 * @author mo
 *
 */
public class Manager {
		String name;
		String password;
		//��ʾ����Ա��Ϣ
		public void show() {
			System.out.println("����:"+name+",����:"+password);
		}
		//��������
		public void updatePassword() {
			Scanner input=new Scanner(System.in);
			System.out.print("�������û���:");
			String name1=input.next();
			System.out.print("����������:");
			String password1=input.next();
			if(name1.equals(this.name)&&(password1.equals(this.password))) {
				System.out.print("������������:");
				String newPassword=input.next();
				System.out.println("�޸�����ɹ���������������:"+newPassword);
			}else {
				System.out.println("�û��������벻��ȷ����û��Ȩ�޸��¹���Ա��Ϣ");
			}
		}
		
}
