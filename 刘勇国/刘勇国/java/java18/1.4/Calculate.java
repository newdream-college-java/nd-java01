package ��18���쳣��ҵ1_4;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.log4j.*;

import ��18���쳣��ҵ1_3.���log4j���óɹ�;
public class Calculate {	
	static Logger log =Logger.getLogger(Calculate.class);
	public static void main(String[] args) {
	
		Scanner input =new Scanner(System.in);
		int x=5;
		int y=5;
		long s=0;
		try{	
			System.out.println("�����뱻����");
			x=input.nextInt();
			System.out.println("���������");
			y=input.nextInt();
			s=x/y;
		}catch(InputMismatchException e){
			log.error("�������ͳ�����ҪΪ����");
		}catch(ArithmeticException e){
			log.warn("��������Ϊ0");
		}catch(Exception e){
			log.warn(e.getMessage());
		}
		log.info("x/y="+x/y);
	}
}
