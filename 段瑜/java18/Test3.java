package ��ҵ;

import java.util.Scanner;




import org.apache.log4j.Logger;

public class Test3 {
	static Logger log =Logger.getLogger(Test3.class);
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		try{
			System.out.println("�����뱻����");
			int a=input.nextInt();
			System.out.println("���������");
			int b=input.nextInt();
			System.out.println(a/b);
		}catch(Exception e){
			e.printStackTrace();
			log.debug("�����쳣");	
		}finally{
			System.out.println("��лʹ�ñ�����");
		}
	}
}
