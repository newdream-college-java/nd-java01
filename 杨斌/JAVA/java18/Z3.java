package com.java.java18.Z3;
import java.util.Scanner;

import org.apache.log4j.Logger;
public class Z3 {
	static Logger log =Logger.getLogger(Z3.class);
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a;
		int b;
		try {
			System.out.println("�����뱻����");
			a=input.nextInt();
			System.out.println("���������");
			b=input.nextInt();
			System.out.println(a/b);
		} catch (Exception e) {
			e.printStackTrace();
			log.debug("�����쳣");		
			
		}finally{
			System.out.println("��лʹ�ñ�����");
		}
		
		

	}
	
}
