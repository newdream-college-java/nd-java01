import java.util.Scanner;
import java.util.Random;
public class Aqw{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		Random sjs =new Random();
		System.out.println("һ����ȭ��Ϸ");
		int w = input.nextInt();
		//System.out.println();
		while(w>=0&&w<3){
			if(w==0){
				System.out.println("���ȭͷ");
				int e =sjs.nextInt(2);
				if(e==0){
					System.out.println("������ȭͷ");
					System.out.println("����ƽ��");
					break;
				}
				if(e==1){
					System.out.println("�����˼���");
					System.out.println("��Ӯ��");
					break;
				}
				if(e==2){
					System.out.println("�����˲�");
					System.out.println("������Ӯ��");
					break;
				}
					break;
			}
			if(w==1){
				System.out.println("�������");
				int e =sjs.nextInt(2);
				if(e==0){
					System.out.println("������ȭͷ");
					System.out.println("������");
					break;
				}
				if(e==1){
					System.out.println("�����˼���");
					System.out.println("ƽ��");
					break;
				}
				if(e==2){
					System.out.println("�����˲�");
					System.out.println("��������");
					break;
				}
					break;
			}
			if(w==2){
				System.out.println("�����");
				int e =sjs.nextInt(2);
				if(e==0){
					System.out.println("������ȭͷ");
					System.out.println("��Ӯ");
					break;
				}
				if(e==1){
					System.out.println("�����˼���");
					System.out.println("������");
					break;
				}
				if(e==2){
					System.out.println("�����˲�");
					System.out.println("ƽ��");
					break;
				}	break;
			}
			
				
		
			


		}


	}
}
