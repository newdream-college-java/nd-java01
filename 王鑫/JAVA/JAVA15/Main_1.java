package Tast2019_3_11_z15;

import java.util.Random;
import java.util.Scanner;

public class Main_1 {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("����������������");
			int day = input.nextInt();
			System.out.print("��������������ͣ�1.�γ� 2.�ͳ�����");
			int n = input.nextInt();
			String cx;
			String lx;
			int jg;
			if (n==1) {
				System.out.println("��ѡ���ͣ�1.GL8 2.���� 3�������������");
				n = input.nextInt();
				Random rd = new Random();
				if (n==1) {
					n = rd.nextInt(1000);
					Car_1 car = new Car_1(("��Gk"+n),day,"��������GL8",600);
				}else if (n==2) {
					Car_1 car = new Car_1(("��Gk"+n),day,"����550i",500);					
				}else if (n==3) {
					Car_1 car = new Car_1(("��Gk"+n),day,"���������",300);					
				}
			}else if(n==2){
				
			}
			
	}
}
