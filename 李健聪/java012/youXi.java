package ʮ����;

import java.util.Scanner;

public class youXi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name="asd";
		int count=0;
		int win = 0;
		int shu=0;
		Scanner input = new Scanner(System.in);
		System.out.println("-------------��ӭ������Ϸ����-------------\n");
		System.out.println("\t\t******************");
		System.out.println("\t\t**   ��ȭ,��ʼ   ***");
		System.out.println("\t\t******************");
		System.out.println("��ȭ����:1.���� 2.ʯͷ 3.��");
		System.out.println("��ѡ��Է���ɫ(1������2����Ȩ3���ܲ�)");
		int a=input.nextInt();
		switch(a){
		case 1:
			System.out.println("��ѡ������������ս");
			name="����";
			
			break;
		case 2:
			System.out.println("��ѡ������Ȩ��ս");
			name="��Ȩ";
			break;
		case 3:
			System.out.println("��ѡ���˲ܲٶ�ս");
			name="�ܲ�";
			break;
		}
		System.out.println("���������������");
		String name1=input.next();
		System.out.println(name1+"VS"+name);
		
		Computer com=new Computer();
	
		User user=new User();
		while(true){
			System.out.println("Ҫ��ʼ�𣿣�y/n��");
			String answer=input.next();
			System.out.println("���ȭ1.���� 2.ʯͷ 3.��");
			if(answer.equals("y")){
				user.cq();
				com.cq();
				int n=user.a;
				int m=com.a;
				if(n-m==-2||n-m==1){
					System.out.println("��ϲ�㣬��Ӯ��");
					win=user.score;
					win++;
					count++;
				}else if(n-m==-1||n-m==2){
					System.out.println("���ź���������");
					shu=com.score;
					shu++;
					count++;
				}else{
					System.out.println("ƽ��Ӵ������Ӵ");
					count++;
				}
			}else if(answer.equals("n")){
				System.out.println(name+"VS"+name1);
				System.out.println("��ս����"+count);
				if(win>shu){
					System.out.println("������ۣ���Ӯ�˰���������");
					break;
				}else if(win<shu){
					System.out.println("������Ǻǣ��������´μ��Ͱ�!");
					break;
				}else{
					System.out.println("�������ƽ�ˣ��´μ��Ͱ�");
					break;
				}
			}
		}
	
		
		
		
	}

}
