package java13;
import java.util.Scanner;
public class Account {
	int sum=0;
	void show9(){
		Scanner input=new Scanner(System.in);
		
		
		int c;
		do{
			System.out.println("������1����� 2��ȡ�� 0���˳�");
			System.out.println("��ѡ������Ҫ�����ҵ��");
			c=input.nextInt();
			if(c==1){
				System.out.println("����������");
				int q=input.nextInt();
				System.out.println("���ɹ�");
				sum=sum+q;
				System.out.println("��ǰ���Ϊ��");
				
			}else if(c==2){
				System.out.println("������ȡ����");
				int q=input.nextInt();
				System.out.println("ȡ��ɹ�");
				sum=sum-q;
				
				
			}else if(c==0){
					System.out.println("ллʹ�ã�����");
			}else{
				System.out.println("�ף������������");
			}		
			System.out.println("��ǰ���Ϊ��"+sum);
			
		}while(c!=0);
	}
	/*void show1(){
		Scanner input=new Scanner(System.in);
		System.out.println("������1����� 2��ȡ�� 0���˳�");
		System.out.println("��ѡ������Ҫ�����ҵ��");
		System.out.println("����������");
		int q=input.nextInt();
		System.out.println("���ɹ�");
		System.out.println("��ǰ���Ϊ��"+show()+q);
	}*/
}
