package ��ʮ����ҵ;

import java.util.Scanner;

public class Compare2 {
	Custmoer2 c1 =new Custmoer2();
	public void input(){
		
		Scanner input =new Scanner(System.in);
		System.out.print("���������");
		c1.score=input.nextInt();
		System.out.print("������ͻ��Ŀ�����");
		c1.type=input.next();
		compare();
	}
	public void compare(){
		if(c1.score>500&&!c1.equals("��")){
			System.out.print("\n����500�֣�");
		}else if(c1.score>1000&&c1.equals("��")){
			System.out.print("\n����500�֣�");
		}
	}
}
