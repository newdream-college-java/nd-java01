package ��ҵ;
import java.util.Scanner;


public class Zy1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������1-3������");
		Scanner input=new Scanner(System.in);
		try {
			int s=input.nextInt();
			if (s==1) {
				System.out.println("C#���");
			}else
			if (s==2) {
				System.out.println("java���");
			}else
			if (s==3) {
				System.out.println("SQL����");
			}else{
				System.out.println("�������");
			}
		} catch (Exception e) {
			System.out.println("�������ֻ������1-3������");
		}finally{
			System.out.println("��ӭ�������");
		}
		
	}

}
