package ��ҵ;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Zy4 {
	public static void main(String[] args) {
		Logger log=Logger.getLogger(Zy4.class);
		Scanner input=new Scanner(System.in);
		
		try {
			System.out.println("������һ������");
			int b=input.nextInt();
			System.out.println("������һ������");
			int c=input.nextInt();
			System.out.println(String.format("%d / %d = %d", b, c, b / c));
		}catch(InputMismatchException e) {
        	log.error("���벻ƥ����");
        } catch(ArithmeticException e) {
			log.warn("��������Ϊ0");         
        }catch(Exception e) {
        	log.error(" �������͵��쳣");
        }finally {
            System.out.println("��лʹ�ñ�����");
        }
	}
}
