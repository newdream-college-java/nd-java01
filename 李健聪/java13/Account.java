package ��ʮ������ҵ;

import java.util.Scanner;

public class Account {
	double sum=0;
	Scanner input=new Scanner(System.in);
	public Account(int sum){
		for(;;){
			System.out.println("1.���  2.ȡ��  0.�˳�\n��ѡ������Ҫ�����ҵ��");
			int a=input.nextInt();
			if(a==1){
				System.out.println("����������:");
				double b=input.nextDouble();
				sum+=b;
				System.out.println("���ɹ�\n");
				System.out.println("***��ǰ���Ϊ��"+sum+"***");
			}
			if(a==2){
				System.out.println("������ȡ����:");
				double b=input.nextDouble();
				if(b>sum){
					System.out.println("��û����ô��Ǯ����ȡ����ȥ��,�ټ���");
					break;
				}else{
					sum-=b;
					System.out.println("ȡ��ɹ�\n");
					System.out.println("***��ǰ���Ϊ��"+sum+"***");
				}
				
			}if(a==0){
				System.out.println("ллʹ��");
				break;
			}
			if(!(a>=0&&a<=2)){
				System.out.println("������������������");
			}
			
		}
	
	}
}
