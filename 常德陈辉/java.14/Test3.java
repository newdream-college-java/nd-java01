package zuoye;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭ����������꣡");
		System.out.print("��ѡ��Ҫ�����ĳ�������֣�");
		String name=input.next();
		System.out.print("��ѡ��Ҫ�����ĳ�������:(1,����2,���3,��");
		int a=input.nextInt();
		Dog dog=new Dog();
		Pig pig=new Pig();
		Penguin penguin=new Penguin();
		if(a==1){
			System.out.print("��ѡ�񹷹���Ʒ�֣�(1����������������2������ѩ����");
			int b=input.nextInt();
			if(b==1){
				dog.setName(name);
				System.out.println("������԰ף�");
				dog.printDog();
			}else{
				System.out.println("������԰ף�");
				dog.printDog();
			}
		}else if(a==2){
			System.out.print("��ѡ�񹷹���Ʒ�֣�(1��Q��2��Q�ã�");
			int b=input.nextInt();
			if(b==1){
				penguin.setName(name);
				System.out.println("������԰ף�");
				penguin.print();
			}else{
				System.out.println("������԰ף�");
				penguin.print();
			}
		}else{
			System.out.print("��ѡ����ë����ɫ��(1����2���ڣ�");
			int b =input.nextInt();
			pig.setName(name);
			if(b==1){
				pig.setColor("��");
			}else{
				pig.setColor("��");
			}
			System.out.println("������԰ף�");
			pig.print();
		}
	}

}
