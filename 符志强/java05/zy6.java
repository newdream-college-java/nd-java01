import java.util.Scanner;
import java.util.Random;
public class zy6{
	public static void  main(String[] args){
		Scanner input=new Scanner(System.in);
		Random sjs=new Random();
		int a=sjs.nextInt(2);
		System.out.println("��������Ĳ�ȭ����0Ϊʯͷ 1Ϊ���� 2Ϊ��");
		int b=input.nextInt();
		while(b>2){
			System.out.println("������Ĵ�����������Ĳ�ȭ����0Ϊʯͷ 1Ϊ���� 2Ϊ��");
			b=input.nextInt();
		}
		while(b<=2&&b>=0){
			if(b==0){
				System.out.println("�������ʯͷ");
				if(a==0){
					System.out.println("���Գ�����ʯͷ");
					System.out.println("����ƽ��");
					break;
				}
				if(a==1){
					System.out.println("���Գ����Ǽ���");
					System.out.println("��Ӯ��");
					break;
				}
				if(a==2){
					System.out.println("���Գ����ǲ�");
					System.out.println("������");
					break;
				}
			}
			if(b==1){
				System.out.println("������Ǽ���");
				if(a==0){
					System.out.println("���Գ�����ʯͷ");
					System.out.println("������");
					break;
				}
				if(a==1){
					System.out.println("���Գ����Ǽ���");
					System.out.println("����ƽ��");
					break;
				}
				if(a==2){
					System.out.println("���Գ����ǲ�");
					System.out.println("��Ӯ��");
					break;
				}
			}
			if(b==2){
				System.out.println("������ǲ�");
				if(a==0){
					System.out.println("���Գ�����ʯͷ");
					System.out.println("��Ӯ��");
					break;
				}
				if(a==1){
					System.out.println("���Գ����Ǽ���");
					System.out.println("������");
					break;
				}
				if(a==2){
					System.out.println("���Գ����ǲ�");
					System.out.println("����ƽ��");
					break;
				}	
			}
			
		}
		
	}	
}