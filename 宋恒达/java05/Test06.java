/**
**���ʵ��һ���򵥵�������ԵĲ�ȭ��Ϸ���
**/
import java.util.Scanner;
import java.util.Random;
public class Test06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Random random=new Random();
		System.out.println("���ȭ:�����������ʯͷ������");
		String a=input.next();
		int b=random.nextInt(3);
		switch(a){
			case "ʯͷ":
				if(b==0){
					System.out.println("���Գ�����ʯͷ");
					System.out.println("ƽ��");
				}else if(b==1){
					System.out.println("���Գ����Ǽ���");
					System.out.println("��Ӯ��");
				}else{
					System.out.println("���Գ����ǲ�");
					System.out.println("������");
				}
				break;
			case "����":
				if(b==0){
					System.out.println("���Գ�����ʯͷ");
					System.out.println("������");
				}else if(b==1){
					System.out.println("���Գ����Ǽ���");
					System.out.println("ƽ��");
				}else{
					System.out.println("���Գ����ǲ�");
					System.out.println("��Ӯ��");
				}
				break;
			case "��":
				if(b==0){
					System.out.println("���Գ�����ʯͷ");
					System.out.println("��Ӯ��");
				}else if(b==1){
					System.out.println("���Գ����Ǽ���");
					System.out.println("������");
				}else{
					System.out.println("���Գ����ǲ�");
					System.out.println("��ƽ��");
				}
				break;
		}
	}
}