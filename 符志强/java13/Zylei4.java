package zuoye;

import java.util.Scanner;

public class Zylei4 {
	int sum;
	public void a(int sum) {
		Scanner input=new Scanner(System.in);
		
		boolean f=false;
		while (!f) {
//			System.out.println("1.���  2.ȴ�� 0.�˳�");
//			System.out.print("����������Ҫ�Ĳ�����");
			
			System.out.println("1.���  2.ȴ�� 0.�˳�");
			System.out.print("����������Ҫ�Ĳ�����");
			int s=input.nextInt();	
			
			if (s==1) {
				System.out.print("���������");
				int c=input.nextInt();
				sum+=c;
				System.out.println("���ɹ�");
				System.out.println("**��ǰ���Ϊ��"+sum+"Ԫ***");
				
				System.out.println("�Ƿ��˳�");
				System.out.println("1.���� ����.�˳�");
				int jt=input.nextInt();
				if (jt==1) {
					continue;
				}else{
					System.out.println("���ѽ�������");
					f=true;
				}
			}
			if (s==2) {
				System.out.print("������ȡ���");
				int q=input.nextInt();
				if (sum<q) {
					System.out.println("�������");
					System.out.println("�Ƿ��˳�");
					System.out.println("1.���� ����.�˳�");
					int jt=input.nextInt();
					if (jt==1) {
						continue;
					}else{
						System.out.println("���ѽ�������");
						f=true;
					}
					
				}else{
					sum-=q;
					System.out.println("ȡ��ɹ�");
					System.out.println("**��ǰ���Ϊ��"+sum+"Ԫ***");
					System.out.println("�Ƿ��˳�");
					System.out.println("1.���� ����.�˳�");
					int jt=input.nextInt();
					if (jt==1) {
						continue;
					}
					else{
						System.out.println("���ѽ�������");
						f=true;
					}
				}
			}
			if (s==0) {
				System.out.println("���ѽ�������");
				f=true;
			}
			if(s<0||s>2){
				System.out.println("�����������������");
			}
		}
	}
}
