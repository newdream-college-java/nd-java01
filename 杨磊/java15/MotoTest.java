package com.nd.zuoye.yl;

import java.util.Scanner;

public class MotoTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Car a = new Car();
		Bus b = new Bus();
		System.out.println("��ӭ�����������޹�˾��");
		String k = null;
		do{
			System.out.println("��ѡ����Ҫ���޵���������:(1.�γ� 2.�ͳ�)");
			switch(input.nextInt()){
				case 1:
					System.out.println("��������Ҫ���޵Ľγ�Ʒ�ƣ���1.���� 2.��ˣ�");
					switch(input.nextInt()){
						case 1:
							String brand1 = Car.��;
							System.out.println("��ѡ����Ҫ���޵Ľγ�Ʒ�ƣ���1.��ϵ 2.550i��");
							int l = input.nextInt();
							switch(l){
								case 1:
									String type1 = Car.��;
									System.out.println("��������Ҫ���޵�������");
									int days1 = input.nextInt();
									a.calcRent(days1,brand1,type1);
									break;
								case 2:
									String type2 = Car.i;
									System.out.println("��������Ҫ���޵�������");
									int days2 = input.nextInt();
									a.calcRent(days2,brand1,type2);
									break;
								default:
									System.out.println("û�����ѡ�������¿�ʼѡ��");
									continue;
									
							}
							break;
						case 2:
							String brand2 = Car.��;
							System.out.println("��ѡ����Ҫ���޵Ľγ�Ʒ�ƣ���1.GL8 2.��������");
							int m = input.nextInt();
							switch(m){
								case 1:
									String type1 = Car.G;
									System.out.println("��������Ҫ���޵�������");
									int days1 = input.nextInt();
									a.calcRent(days1,brand2,type1);
									break;
								case 2:
									String type2 = Car.��;
									System.out.println("��������Ҫ���޵�������");
									int days2 = input.nextInt();
									a.calcRent(days2,brand2,type2);
									break;
								default:
									System.out.println("û�����ѡ�������¿�ʼѡ��");
									continue;
									
							}
							break;
						default:
							System.out.println("û�����ѡ�������¿�ʼѡ��");
							continue;
							
					}
					break;
				case 2:
					System.out.println("��������Ҫ���޵Ŀͳ�Ʒ�ƣ���1.�� 2.������");
					switch(input.nextInt()){
						case 1:
							String brand1 = Bus.��;
							System.out.println("��ѡ����Ҫ���޵Ŀͳ���λ������1.<=16 2.>16��");
							int l = input.nextInt();
							switch(l){
							case 1:
								String seatCount1 = Bus.С��16;
								System.out.println("��������Ҫ���޵�������");
								int days1 = input.nextInt();
								b.calcRent(days1,brand1,seatCount1);
								break;
							case 2:
								String seatCount2 = Bus.����16;
								System.out.println("��������Ҫ���޵�������");
								int days2 = input.nextInt();
								b.calcRent(days2,brand1,seatCount2);
								break;
							default:
								System.out.println("û�����ѡ�������¿�ʼѡ��");
								continue;
								
						}
							break;
						case 2:
							String brand2 = Bus.��;
							System.out.println("��ѡ����Ҫ���޵Ŀͳ���λ������1.<=16 2.>16��");
							int m = input.nextInt();
							switch(m){
							case 1:
								String seatCount1 = Bus.С��16;
								System.out.println("��������Ҫ���޵�������");
								int days1 = input.nextInt();
								b.calcRent(days1,brand2,seatCount1);
								break;
							case 2:
								String seatCount2 = Bus.����16;
								System.out.println("��������Ҫ���޵�������");
								int days2 = input.nextInt();
								b.calcRent(days2,brand2,seatCount2);
								break;
							default:
								System.out.println("û�����ѡ�������¿�ʼѡ��");
								continue;
								
						}
							break;
						default:
							System.out.println("û�����ѡ�������¿�ʼѡ��");
							continue;
					}
					break;
				default:
					System.out.println("û�����ѡ�������¿�ʼѡ��");
					continue;

					
			}
			System.out.println("��������⳵��y/n");
			k = input.next();
		}while(k.equals("y"));

		System.out.println("лл���ʹ�ã�");

	}

}
