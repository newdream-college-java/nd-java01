package ��18���쳣��ҵ1_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01 {
	public static void choice()throws Exception{
		Scanner input =new Scanner(System.in);
		System.out.println("������1-3�е�һ������");
		int choice=input.nextInt();
		if(choice>3||choice<1){
			throw new Exception("���뷶Χ����");//������д�Զ����쳣�����ƣ��ڱ����õ�ʱ��ʹ��e.getMessage()������嶨�쳣������
		}
		if(choice==1){
			System.out.println("C#���");
		}else if(choice==2){
			System.out.println("SQL����");
		}else if(choice==3){
			System.out.println("JAVA���");
		}
	}
	public static void main(String[] args) {
		try{
			choice();	//�������Զ����쳣
		}catch(InputMismatchException e){
			System.out.println("�������Ͳ�ƥ��");
		}catch(Exception e){	
			System.out.println(e.getMessage());	//�������õ��Զ�����쳣��Ϣ
		}
	finally{
			System.out.println("��ӭ�������");
		}
		
	}
}



