import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;


public class Testlog2 {

	static Logger log=Logger.getLogger(Testlog2.class);
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		//��ʾ���뱻�����ͳ���
		try{
			System.out.print("�����뱻��������������");
			int a=input.nextInt();
			System.out.print("�������������������");
			int b=input.nextInt();
			System.out.println(a/b);
			log.info("a/b="+(a/b));
		}catch(ArithmeticException e){
			e.printStackTrace();
			log.warn("��������Ϊ0");
		}catch(InputMismatchException e){
			e.printStackTrace();
			log.error("�������ͳ���������������");
		}catch(Exception e){
			e.printStackTrace();
			log.error("�������쳣");
		}finally{
			System.out.println("��лʹ�ñ�����");
		}
	}

}
