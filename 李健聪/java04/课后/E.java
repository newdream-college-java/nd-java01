import java.util.Scanner;
import java.util.Random;                    //���a==b  ��ô��ƽ  ���a=0,b=1 aӮ b=2  bӮ  a=1 
public class E{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rd=new Random();
		int a=rd.nextInt(3);
		System.out.println("��������Ҫ��������,0����ʯͷ��1���������2����");
		int b=input.nextInt();
		switch(a){
			if(a==0){
				System.out.println("���Գ�����ʯͷ");
				switch(b){
					case 0:
					System.out.println("�������ʯͷ");
					System.out.println("��ƽ");
					break;
					case 1:
					System.out.println("������Ǽ���");
					System.out.println("������");
					break;
					case 2:
					System.out.println("������ǲ�");
					System.out.println("��Ӯ��");
					break;
					default:
					System.out.println("��������˳�����");
					System.exit(-1);
				}
			}	
		
	}
}
 