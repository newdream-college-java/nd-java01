package ��ʮ����ҵ;

import java.util.Scanner;

public class Initial {
	String adminName;
	String name;
	String passWord;
	String adminPassWord;
	public void show(){
		Scanner input =new Scanner(System.in);
		Admin admin1 =new Admin();
		admin1.name="admin1";
		admin1.passWord="111111";
		Admin admin2 =new Admin();
		admin2.name="admin2";
		admin2.passWord="222222";
		input();
		checkOut();
	}
	
	public void input(){
		Scanner input =new Scanner(System.in);
		System.out.print("�������û�����");
		adminName = input.next();
		System.out.print("\n\n���������룺");
		adminPassWord = input.next();
	}
	public void checkOut(){
		if(adminName.equals("admin1")&&adminPassWord.equals("111111")){
			xiugai();
		}else if(adminName.equals("admin2")&&adminPassWord.equals("222222")){
			xiugai();
		}else{
			System.out.println("�û��������벻ƥ�䣡��û��Ȩ�޸��¹���Ա��Ϣ");
		}
	}
	public void xiugai(){
		Scanner input = new Scanner(System.in);
		System.out.print("������������");
		adminPassWord = input.next();
		System.out.print("�޸�����ɹ�������������Ϊ��"+adminPassWord);
	}
}
