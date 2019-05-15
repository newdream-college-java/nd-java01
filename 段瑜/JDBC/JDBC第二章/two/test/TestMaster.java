package cn.two.test;

import java.util.Scanner;

import cn.two.entity.Dog;
import cn.two.entity.Master;
import cn.two.manager.DogManager;
import cn.two.manager.MasterManager;

public class TestMaster {
	public static void main(String[] args) {
		Master master=new Master();
		Dog dog=new Dog();
		Scanner input=new Scanner(System.in);
		System.out.println("----��ӭ���ٳ�����԰----");
		System.out.print("�������¼����");
		master.setName(input.next());
		System.out.print("�������¼���룺");
		master.setPassword(input.next());
		MasterManager m=new MasterManager();
		DogManager dogs=new DogManager();
		m.select(master);
		if(m.select(master)==true) {
			System.out.println("=============��ӭ���������̵�==============");
			System.out.println("1.��ӳ�����Ϣ 2.�޸ĳ�����Ϣ 3.��ѯ������Ϣ 4.���������Ϣ 0.�˳�");
			System.out.println("==========================================================");
			System.out.println("����������ѡ��");
			int a=input.nextInt();
			switch(a) {
				case 1:
					System.out.println("�����̵�>��ӳ�����Ϣ");
					dogs.save(dog);
					break;
				case 2:
					System.out.println("�����̵�>�޸ĳ�����Ϣ");
					dogs.updateDog(dog);
					break;
				case 3:
					System.out.println("�����̵�>��ѯ������Ϣ");
					System.out.println("\t\t\t������Ϣ�б�");
					System.out.println("\t\t���\t\t����\t\tƷ��");
					dogs.selectDog();
					break;
				case 4:
					System.out.println("�����̵�>���������Ϣ");
					m.save(master);
					break;
				case 0:
					System.out.println("��ӭ�´ι���");
					break;
				default:
					System.out.println("������󣡣�");
					break;
			}
		}
	}
}
