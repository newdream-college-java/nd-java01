package com.nd.zuoye.yl.car;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * �������޹���
 * 
 * @author
 * 
 */
public class Rent2 {
	int money = 0;// ���
	String answer = null;// �ж�
	int sum = 0;// ���
	String brand = null; // Ʒ��
	String type = null; // �ͺ�
	String seat = null; // ��λ��
	int ton = 0;
	Scanner input = new Scanner(System.in);
	Random rd = new Random();
	ArrayList al = new ArrayList();

	public void rent2() {
		System.out.println("********************��ӭ�����������޹�˾*******************");
		// �ͻ��⳵������
		// �ռ��û�����
		do {
			String no = "��A" + (rd.nextInt(90000) + 10000);
			System.out.println("1���γ�   2���ͳ�  3������");
			System.out.print("��ѡ����Ҫ���޵��������ͣ�");
			int chooseCar = input.nextInt();
			switch (chooseCar) {

			// ���޽γ�
			case 1:
				System.out.print("��ѡ����Ҫ���޵Ľγ�Ʒ�ƣ�1�����  2������");
				int choose1 = input.nextInt();
				if (choose1 == 1) {
					brand = "���";
					System.out.print("��ѡ����Ҫ���޵Ľγ��ͺţ�1��������  2��GL8");
					int l = input.nextInt();
					if (l == 1) {
						type = "������";
						money = 300;
					} else if (l == 2) {
						type = "GL8";
						money = 600;
					}
				} else if (choose1 == 2) {
					brand = "����";
					System.out.print("��ѡ����Ҫ���޵Ľγ��ͺţ�1��X6  2��550i");
					int l = input.nextInt();
					if (l == 1) {
						type = "X6";
						money = 400;
					} else if (l == 2) {
						type = "550i";
						money = 500;
					}
				}
				al.add(new Car(brand, no, money, type));
				break;

			// ���޿ͳ�
			case 2:
				System.out.print("��ѡ����Ҫ���޵Ŀͳ�Ʒ�ƣ�1������  2����");
				int choose2 = input.nextInt();
				if (choose2 == 1) {
					brand = "����";
					System.out.print("��ѡ����Ҫ���޵Ŀͳ���λ����1��С��ʮ����  2������ʮ����");
					int l = input.nextInt();
					if (l == 1) {
						seat = "С��ʮ����";
						money = 800;
					} else if (l == 2) {
						seat = "����ʮ����";
						money = 1500;
					}
				} else if (choose2 == 2) {
					brand = "��";
					System.out.print("��ѡ����Ҫ���޵Ŀͳ���λ����1��С��ʮ����  2������ʮ����");
					int l = input.nextInt();
					if (l == 1) {
						seat = "С��ʮ����";
						money = 800;
					} else if (l == 2) {
						seat = "����ʮ����";
						money = 1500;
					}

				}
				al.add(new Bus(brand, no, money, seat));
				break;

			// ���޻���
			case 3:
				System.out.println("��ѡ����Ҫ���޵Ļ���Ʒ�ƣ�1��˹������  2���ֶ���");
				int choose3 = input.nextInt();
				if (choose3 == 1) {
					brand = "˹������";
					System.out.print("��������Ҫ���޵Ļ���������");
					ton = input.nextInt();
					money = ton * 50;

				} else if (choose3 == 2) {
					brand = "�ֶ���";
					System.out.print("��������Ҫ���޵Ļ���������");
					ton = input.nextInt();
					money = ton * 50;

				}
				al.add(new Lorry(brand, no, money, ton));
				break;

			default:
				break;
			}
			// �������
			sum += money;

			System.out.print("�Ƿ�������ޣ���y/n��");
			answer = input.next();
		} while (answer.equals("y"));

		System.out.print("������Ҫ���޵�������");
		int day = input.nextInt();
		System.out.println("�����ܷ�����" + sum * day + "Ԫ");
		print();
		input.close();
	}

	public void print() {
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));

		}
	}

}