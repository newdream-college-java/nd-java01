package Test3;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Test03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Logger log=Logger.getLogger(Test03.class);
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		try{
			System.out.print("�����뱻������");
			int a=input.nextInt();
			System.out.print("�����������");
			int b=input.nextInt();
			System.out.println(a/b);
		}catch(Exception e){
			e.printStackTrace();
			log.debug("�����쳣");
		}finally{
			System.out.println("ллʹ�ñ�����");
		}
	}

}
