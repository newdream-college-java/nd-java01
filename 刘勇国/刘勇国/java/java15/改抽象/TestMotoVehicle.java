package ��15�¼̳�2��������󷽷�;

import java.util.Random;
import java.util.Scanner;

public class TestMotoVehicle {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ�������������޹�˾��");
		System.out.print("������Ҫ���޵�����");
		int days=input.nextInt();
		System.out.print("������Ҫ���޵�����Ʒ��1.�γ�2.�ͳ�:");
		int choice = input.nextInt();
		if(choice==1){
			Car c1 = new Car();
			c1.setNo("��BK"+random.nextInt(9000)+1000);
			c1.days=days;
			c1.choiceBrand();
		}else{
			Bus b1= new Bus();
			b1.setNo("��BK"+random.nextInt(10000));
			b1.days=days;
			b1.choiceBusType();
		}
	}
}
