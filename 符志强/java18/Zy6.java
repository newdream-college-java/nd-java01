package ��ҵ;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Zy6 {
	public static void main(String[] args) {
		Logger log=Logger.getLogger(Zy6.class);
		Scanner input=new Scanner(System.in);
		String[] a=new String[5];
		try {			
			for (int i = 0; i <=a.length; i++) {
				System.out.println("�������������ֵ");
				a[i]=input.next();
			}				
		}catch(ArrayIndexOutOfBoundsException e) {
			log.error("����Խ��");
        }catch(Exception e) {
        	log.error(" �������͵��쳣");
        }
	}
}
