package Test03;

import java.util.Scanner;

public class Bus extends MotoVehicle{
	Scanner input=new Scanner(System.in);
	public void shuchu(){
		System.out.print("������Ҫ��ƾ������Ʒ��(1,���� 2����ˣ���");
		int a=input.nextInt();
		if(a==1){
			setFy(500);
			setBrand("����");
			setNo("��BK5543");
			System.out.println("��������������ƺ��ǣ�"+getNo()+"����Ʒ���ǣ�"+getBrand());
		}else{
			System.out.print("������γ����ͺ�1�������GL8 2��������");
			int b=input.nextInt();
			if(b==1){
				setFy(600);
				setBrand("���");
				setNo("��BK5544");
				System.out.println("���Գɹ���ƾ�����ƺ��ǣ�"+getNo()+"����Ʒ���ǣ�"+getBrand());
			}else{
				setFy(300);
				setBrand("���");
				setNo("��BK5545");
				System.out.println("���Գɹ���ƾ�����ƺ��ǣ�"+getNo()+"����Ʒ���ǣ�"+getBrand());
			}
		}
	}
}
