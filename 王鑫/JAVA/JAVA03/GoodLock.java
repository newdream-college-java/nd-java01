/*
����GoodLockʵ�����˳齱���齱���򣺻�Ա�ŵİ�λ���ֵ��ڲ�����������ּ���

*/import java.util.Scanner;

public class GoodLock{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("������4λ��Ա����:");
		int n=input.nextInt();				//�����λ����.
		int a=n/100%10;					//�����ȡ1~10֮�����
		int b = (int)(Math.random());			//�����λ����==�����ȡ�������.
		for(int i=0;i<10;i++){
			if(a==b){
				System.out.println(n+"�ſͻ������˿ͻ�,��þ���MP3һ��!");
			}else{		
				System.out.println(n+"�ſͻ��������˿ͻ�!"+b);
			}
		}
	}
}