import java.util.Scanner;


public class Player {
	String name;
	int score;
	//��ʼ��Ϸ������
	public int chuquan(){
		Scanner input=new Scanner(System.in);
		int choice=0;
		System.out.println("��ѡ���ȭ��1.ʯͷ   2.����   3.��");
		if(input.hasNextInt()){
			choice=input.nextInt();
			switch(choice){
				case 1:
					System.out.println("���ȭ��ʯͷ��");
					break;
				case 2:
					System.out.println("���ȭ��������");
					break;
				case 3:
					System.out.println("���ȭ������");
					break;
				default:
					System.out.println("�ܱ�Ǹ����������������ȭ���͵����֣�");
					chuquan();
					break;
			}
		}else{
			System.out.println("�ܱ�Ǹ���޷�ִ�У�������������������֣�");
			chuquan();
		}
		return choice;
	}
}
