package �������ϵͳ;

import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Car qc=new Car();
		Bus kc=new Bus();
		int a;
		System.out.print("��������Ҫ���޶����죺");
		int day=input.nextInt();
		System.out.print("������Ҫ���޵��������ͣ�1.�γ� 2.�ͳ�����");
		int type=input.nextInt();
		switch(type){
			case 1:
				System.out.print("������Ҫ���޵��������ͣ�1.���� 2.��ˣ���");
				a=input.nextInt();
				switch(a){
					case 1:
						qc.getCar1();
						qc.setType("����550i");
						System.out.println("�˿����ã������޵ĳ����ǣ�"+qc.getType()+"������Ҫ֧�������޷�����"+(qc.getMoney()*day));
						break;
					case 2:
						System.out.print("������γ����ͺ�2�������GL8 3��������:");
						switch(a=input.nextInt()){
							case 2:
								qc.getCar2();
								qc.setType("�����GL8");
								System.out.println("�˿����ã������޵ĳ����ǣ�"+qc.getType()+"������Ҫ֧�������޷�����"+(qc.getMoney()*day));
								break;
							case 3:
								qc.getCar3();
								qc.setType("������");
								System.out.println("�˿����ã������޵ĳ����ǣ�"+qc.getType()+"������Ҫ֧�������޷�����"+(qc.getMoney()*day));
								break;
							default:
								break;
						}
						break;
					default:
						break;		
				}
				break;
			case 2:
				System.out.print("������Ҫ���޵��������ͣ�1.�� 2.��������");
				a=input.nextInt();
				switch(a){
					case 1:
						kc.getBus1();
						kc.setSeatCount("С��16���Ľ���");
						System.out.println("�˿����ã������޵ĳ����ǣ�"+kc.getSeatCount()+"������Ҫ֧�������޷�����"+(kc.getMoney()*day));
						break;
					case 2:
						kc.getBus2();
						kc.setSeatCount("����16���Ľ�");
						System.out.println("�˿����ã������޵ĳ����ǣ�"+kc.getSeatCount()+"������Ҫ֧�������޷�����"+(kc.getMoney()*day));
						break;
					default:
						break;
				}
			default:
				break;
				
		}
	}
}

