package exercise4;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Test {
	public static void main(String[] args) {
		Logger logger=Logger.getLogger(Test.class);
		Scanner input=new Scanner(System.in);
		try {
			System.out.print("�����뱻����:");
			int a=input.nextInt();
			System.out.print("���������:");
			int b=input.nextInt();
			int c=a/b;
			System.out.println(c);
		}catch(InputMismatchException e) {
			logger.error("�������ͳ�������������");
		}catch(ArithmeticException e) {	
			logger.warn("��������Ϊ0");
		}catch(Exception e) {
			logger.error("�����쳣");
		}finally {
			System.out.println("��ӭʹ�ñ�ϵͳ");
		}
	}
}
