package Test2019_3_12_z16;

import java.util.*;

public class Test02 {
	public static void main(String[] args) {
		Car car = new Car();
		Bus bus = new Bus();
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ�������������޹�˾��");
		System.out.print("������������ʵ������");
		String name = input.next();
		System.out.print("������Ҫ���޵�������");
		int day = input.nextInt();
		int money = 0;
		while (true) {
			System.out.print("������Ҫ���޵��������ͣ�1,�γ� 2,�ͳ� 3,���磩:");
			int n = input.nextInt();
			if (n==1) {//�γ�
				System.out.print("������Ҫ���޵�����Ʒ�ƣ�1,���� 2,��ˣ�:");
				n = input.nextInt();
				if (n==1) {
					//����
					car.setLx("����");
				}else {
					//���
					car.setPp("���");
				}
				System.out.print("������Ҫ���޵������ͺţ�1,��������GL8 2,���� 3,��������:");
				if (n==1) {
					//��������GL8
					money+=600;
					car.setXh("��������GL8");
				}else if (n==2) {
					//����
					money+=500;
					car.setXh("����");
				}else{
					//������
					money+=300;
					car.setXh("������");
				}
				n=input.nextInt();
				Random rd = new Random();
				System.out.println("�˿����ã�����Ҫ֧�������޷����ǣ�"+money*day);
				System.out.println("����������ĳ��ƺ���:��BK"+rd.nextInt((1000)+1000));
			}else if(n==2){//�ͳ�
				System.out.print("������Ҫ���޵Ŀͳ�Ʒ�ƣ�1,�� 2,������:");
				n = input.nextInt();
				if (n==1) {
					//��
					bus.setPp("��");
				}else{
					//����
					bus.setPp("����");
				}
				System.out.print("������Ҫ���޵������ͺţ�1,<=16�� 2,>16����:");
				n=input.nextInt();
				if (n==1) {
					//<=16��
					money+=800;
					bus.setPp("<=16��");
				}else {
					//>16��
					money+=1500;
					bus.setPp(">16��");
				}
				Random rd = new Random();
				System.out.println("����������ĳ��ƺ���:��BK"+rd.nextInt((1000)+1000));
			}else{
				System.out.print("������Ҫ���޵Ŀ�����λ:");
				n=input.nextInt();
				money += 50*n;
				Random rd = new Random();
				System.out.println("����������ĳ��ƺ���:��BK"+rd.nextInt((1000)+1000));
			}
			System.out.print("�����Ƿ���Ҫ�������޳�����y/n��:");
			String s = input.next();
			if (s.equals("y")) {
				continue;
			}else break;
		}
		System.out.println("�ͻ�������"+name+",��������:"+day+",�����ܷ��ã�"+day*money);
	}
}
