package ��ҵ;


import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;



public class Test4 {
	static Logger log =Logger.getLogger(Test4.class);
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		try{
			System.out.println("�����뱻����");
			int a=input.nextInt();
			System.out.println("���������");
			int b=input.nextInt();
			System.out.println(a/b);
		}catch(InputMismatchException e){
			System.out.println("����������");
		}catch(ArithmeticException e){
			System.out.println("��������Ϊ0");	
		}catch (Exception e) {
			e.printStackTrace();
			log.debug("�����쳣");
		}finally{
			System.out.println("��лʹ�ñ�����");
		}
	}
}
