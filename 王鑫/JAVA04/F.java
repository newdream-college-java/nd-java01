//���ʵ��һ���򵥵�������ԵĲ�ȭ��Ϸ�����

import java.util.Scanner;
import java.util.Random;

public class F{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		Random rdm = new Random();
		System.out.print("�����룺");
		int n = input.nextInt();
		while(n==0||n==1||n==2){
			int m = rdm.nextInt(3);
			if(n==0&&m==1){							//����
				System.out.print("��ҳ������ӡ������Գ��������������ʤ����\n\n���ٴ����룺");
			}else if(n==1&&m==2){						//����
				System.out.print("��ҳ��������������Գ������������ʤ����\n\n���ٴ����룺");
			}else if(n==2&&m==0){						//��
				System.out.print("��ҳ������������Գ������ӡ������ʤ����\n\n���ٴ����룺");
			}else{
				if(m==0){
					System.out.print("��ҳ��������������Գ������ӡ�������ʤ����\n\n���ٴ����룺");
				}else if(m==1){
					System.out.print("��ҳ������������Գ���������������ʤ����\n\n���ٴ����룺");
				}else{
					System.out.print("��ҳ������ӡ������Գ�������������ʤ����\n\n���ٴ����룺");				
				}

			}
			n = input.nextInt();
		}
	}
}