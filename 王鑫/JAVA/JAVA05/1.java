/*
����GoodLockʵ�����˳齱���齱���򣺻�Ա�ŵİ�λ���ֵ��ڲ�����������ּ���
*/
import java.util.Random;

public class 1{
	public static void main(String[] args){
		Random rd = new Random();
		int b = rd.nextInt(10);			//ѭ��10����Ϊ�˼��������гԷ������ȷ�Ľ��
		for(int i=0;i<10;i++){
		b = rd.nextInt(10);
		System.out.println(b);
		}				//�����λ����==�����ȡ�������.
			
	}
}