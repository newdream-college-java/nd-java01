package Test2019_3_17_z18;

import java.util.Scanner;
import java.util.logging.LogManager;

import org.apache.log4j.Logger;
public class Test_3 {
	public static void main(String[] args) {		
		Scanner input =new Scanner(System.in);
		LogManager log =Logger.getLogger(Test_3.class);
		
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