package zuoye;

import java.util.Scanner;

public class StartSMS {
	public void pan(){
		Scanner input = new Scanner(System.in);
		Menu l = new Menu();
		String mana="admin";
		int pW=123456;
		System.out.println("�������û�����");
		String g=input.next();
		if(g.equals(mana)){
			System.out.println("���������룺");
			int p=input.nextInt();
			if(p==pW){
				l.showMainMenu();
			}else{
				System.out.println("Ŷ������������˿����");
				System.exit(0);
			}
		}else{
			System.out.println("Ŷ�������㲻�ǹ���Ա�����");
			System.exit(0);
		}
		
		
	}
}
