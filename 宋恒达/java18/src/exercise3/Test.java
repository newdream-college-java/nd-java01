package exercise3;

import java.util.Scanner;

import org.apache.log4j.Logger;
/**
 * ʹ��try-catch-finally���log4j�����־������̨������˵������
 * ����̨��ʾ���뱻�����ͳ������������Ϊ0���ڿ���̨���������Ϣ��������ɵ��쳣��ջ��Ϣ
 * @author mo
 *
 */
public class Test {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Logger logger=Logger.getLogger(Test.class);
		System.out.print("�����뱻����:");
		int a=input.nextInt();
		System.out.print("���������:");
		int b=input.nextInt();
		try {
			int c=a/b;
		}catch(ArithmeticException e) {
			logger.error("ϵͳ����",e);
		}catch(Exception e) {
			
		}finally {
			System.out.println("��лʹ�ô˳���");
		}
	}
}
