package Test4;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Test04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log=Logger.getLogger(Test04.class);
		Scanner input=new Scanner(System.in);
		int a=1,b=2;
		try{
			System.out.print("�����뱻������");
			a=input.nextInt();
			System.out.print("�����������");
			b=input.nextInt();
			System.out.println(a/b);
			log.info("a/b="+a/b);
		}catch(InputMismatchException e){//�����Ϊ��������
			
			log.error("�������ͳ���������������");
		}catch(ArithmeticException e){//�������Ϊ0
			
			log.error("��������Ϊ�㡣");
		}
	}

}
