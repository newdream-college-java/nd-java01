import java.util.Scanner;

import org.apache.log4j.Logger;


public class Hw03 {
	static Logger log=Logger.getLogger(Hw03.class);
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		//��ʾ���뱻�����ͳ���
		try{
			System.out.print("�����뱻������");
			int a=input.nextInt();
			System.out.print("�����������");
			int b=input.nextInt();
			System.out.println(a/b);
		}catch(Exception e){
			e.printStackTrace();
			log.error("�����쳣");
		}finally{
			System.out.println("��лʹ�ñ�����");
		}
	}

}
