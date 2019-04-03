package exercise5;
/**
 * ��д�ܲ���ArrayIndexOutOfBoundException�쳣�Ĵ���
 * �����䲶���ڿ���̨������쳣��Ϣ
 * ʹ��log4j��¼��־������̨���ļ�
 */
import org.apache.log4j.Logger;

public class Test {
	public static void main(String[] args) {
		Logger logger=Logger.getLogger(Test.class);
		int[] a=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=1;
		}
		try {
			for(int i=0;i<a.length+1;i++) {
				System.out.println(a[i]);
			}			
		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			logger.error(e);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
