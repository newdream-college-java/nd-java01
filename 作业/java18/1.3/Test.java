package ��18���쳣��ҵ1_3;
import java.util.Scanner;

import org.apache.log4j.Logger;
public class Test {
	static Logger log =Logger.getLogger(Test.class);
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("���뱻����");
		int x=input.nextInt();
		System.out.println("�������");
		int y=input.nextInt();
		long z;
		try{
			z=x/y;
		}catch(Exception e){
			System.err.println(e.getMessage());		//��ͨ��ӡ��ʽ
			log.warn(e.getMessage());				//����쳣���͵�log4j�ļ���ȥ
			log.warn(e.getStackTrace());			//��������Ķ�ջ��Ϣ��log4j��־�ļ���
		}finally{
			System.out.println("ллʹ��");
		}
	}
}
