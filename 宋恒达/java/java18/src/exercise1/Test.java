package exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * ���տ���̨��ʾ����1~3֮������֣����������Ӧ�Ŀγ����ƣ�����1�����C#��
 * ����2�����java��̡�������3�����SQL�����������ݼ�����������жϣ������Ӧ
 * �γ����ƣ����������󣬸���������ʾ�����������Ƿ���ȷ�����������ӭ������顱���
 * @author mo
 *
 */
public class Test {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("������γ̴��ţ�1-3֮������֣���");
		try {
			int num=input.nextInt();
			switch(num) {
				case 1:
					System.out.println("C#��");
					break;
				case 2:
					System.out.println("JAVA��̣�");
					break;
				case 3:
					System.out.println("SQL������");
					break;
				default:
					System.out.println("�������");
			}
		}catch(InputMismatchException e) {
			System.out.println("�������");
		}catch(Exception e) {
			
		}finally {
			System.out.println("��ӭ������飡");
		}
	}
}
