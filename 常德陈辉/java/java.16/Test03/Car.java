package Test03;

import java.util.Scanner;

public class Car extends MotoVehicle {
	Scanner input=new Scanner(System.in);
	public void shuchu(){
		System.out.print("������Ҫ��ƾ�Ŀͳ�Ʒ��(1,�� 2����������");
		int a=input.nextInt();
		if(a==1){
			System.out.print("������ͳ���λ��1��<=16�� 2��>16��");
			int b=input.nextInt();
			if(b==1){
				setFy(800);
				setBrand("��");
				setNo("��BK5533");
				System.out.println("���Գɹ���ƾ�����ƺ��ǣ�"+getNo()+"����Ʒ���ǣ�"+getBrand());
			}else{
				setFy(1500);
				setBrand("��");
				setNo("��BK5522");
				System.out.println("���Գɹ���ƾ�����ƺ��ǣ�"+getNo()+"����Ʒ���ǣ�"+getBrand());
			}	
		}else{
			System.out.print("������ͳ���λ��1��<=16�� 2��>16��");
			int b=input.nextInt();
			if(b==1){
				setFy(800);
				setBrand("����");
				setNo("��BK5511");
				System.out.println("���Գɹ���ƾ�����ƺ��ǣ�"+getNo()+"����Ʒ���ǣ�"+getBrand());
			}else{
				setFy(1500);
				setBrand("����");
				setNo("��BK5588");
				System.out.println("���Գɹ���ƾ�����ƺ��ǣ�"+getNo()+"����Ʒ���ǣ�"+getBrand());
			}
		}
	}
}
