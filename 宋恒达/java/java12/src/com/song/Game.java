package com.song;

import java.util.Scanner;
/**
 * 1ʯͷ 2���� 3��
 *    �� 				����				���
 *1				1				ƽ
 *1				2				��
 *1				3				����
 *2				1				����
 *2				2				ƽ
 *2				3				��
 *3				1				��
 *3				2				����
 *3				3				ƽ	
 * @author mo
 *
 */
public class Game {
	Person person;
	Computer computer;
	int count;
	public void initial() {
		person = new Person();
		computer = new Computer();
		person.name="����";
		person.score=0;
		computer.score=0;
		count=0;
	}

	public void startGame() {
		Scanner input=new Scanner(System.in);
		System.out.println("--------------------��ӭ�������ȭ��Ϸ\n\n\n");
		System.out.println("\t\t*********************************");
		System.out.println("\t\t**\t��ȭ��ʼ\t**");
		System.out.println("\t\t*************");
		System.out.println("��ȭ����:1.ʯͷ��2.������3����");
		System.out.println("��ѡ��Է���ɫ:(1.������2.��Ȩ��3.�ܲ�)");
		int role=input.nextInt();
		switch (role) {
			case 1:
				System.out.println("��ѡ������������ս");
				computer.name="����";
				break;
			case 2:
				System.out.println("��ѡ��������Ȩ��ս");
				computer.name="��Ȩ";
				break;
			case 3:
				System.out.println("��ѡ������ܲٶ�ս");
				computer.name="�ܲ�";
				break;
			default:
				System.out.println("�����������");
				break;
		}
		System.out.println("Ҫ��ʼ��(y/n):");
		String isStart=input.next();
		if(isStart.equals("y")) {
			play();
		}else {
			System.exit(-1);
		}
		
	}
	//��ս
	public void play() {
		//��ʼ�Ծ�
				//1.���ȳ�ȭ
				String anwser=null;
				Scanner in=new Scanner(System.in);
				do {
				int ren=person.punch();
				//2.���Գ�ȭ
				int com=computer.punch();
				if(ren==com) {
					System.out.println("ƽ��");
				}else if((ren-com==-1)||(ren-com==2)) {
					System.out.println("��Ӯ��");
					person.score++;
				}else {
					System.out.println("����Ӯ��");
					computer.score++;
				}
				count++;
				System.out.println("�Ƿ�ʼ��һ�ֱ���(y/n)");
				anwser=in.next();
				}while(anwser.equals("y"));
	}
	//��ʾ���յĶ�ս���
	public void showResult(){
		System.out.println(computer.name+"\tVS\t"+person.name);
		System.out.println("�Ծ־���:"+count);
		if(computer.score>person.score) {
			System.out.println("������");
		}else if(computer.score<person.score) {
			System.out.println("��Ӯ��");
		}else {
			System.out.println("ƽ��");
		}
	}
}
