package java18;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Si {
	static Logger log =Logger.getLogger(Si.class);
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
		} catch (InputMismatchException e) {
			log.error("�������ͳ�������������");		

		}catch (ArithmeticException e) {
			log.debug("��������Ϊ��");	
		}catch (Exception e) {
			log.debug("�����쳣");	
		}finally{
			System.out.println("��лʹ�ñ�����");
		}

	}
}
