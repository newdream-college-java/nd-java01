//���ʵ��һ���򵥵�������ԵĲ�ȭ��Ϸ�����

import java.util.Scanner;
import java.util.Random;

public class F{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		Random rdm = new Random();
		System.out.print("�����룺");
		int w = input.nextInt();
		while(w==0||w==1||w==2){
			int d = rdm.nextInt(3);
			if(w==0&&d==1){							//����
				System.out.print("��ҳ������ӡ������Գ��������������ʤ����\n\n���ٴ����룺");
			}else if(w==1&&d==2){						//����
				System.out.print("��ҳ��������������Գ������������ʤ����\n\n���ٴ����룺");
			}else if(w==2&&d==0){						//��
				System.out.print("��ҳ������������Գ������ӡ������ʤ����\n\n���ٴ����룺");
			}else{
				if(w==1&&d==0){
					System.out.print("1��ҳ��������������Գ������ӡ�������ʤ����\n\n���ٴ����룺");
				}else if(w==2&&d==1){
					System.out.print("1��ҳ������������Գ���������������ʤ����\n\n���ٴ����룺");
				}else if(w==0&&d==2){
					System.out.print("1��ҳ������ӡ������Գ�������������ʤ����\n\n���ٴ����룺");				
				}else{
					System.out.print("ƽ�֣�\n\n���ٴ����룺");
				}

			}
			w = input.nextInt();
		}
	}
}