/**
** 
**/
import java.util.Scanner;
import java.util.Random;
public class GoodLuck{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//��ʾ
		System.out.print("��������λ��Ա��:");
		int num=input.nextInt();
		//��ȡ��Ա�ŵİ�λ�ϵ�����
		int bw=num/100%10;
		//�������һ��0~9������
		Random random=new Random();
		int number=random.nextInt(10);
		System.out.println("�н�����Ϊ:"+number);
		if(bw==number){
			System.out.println("��ϲ���н���");
		}else{
			System.out.println("���ź���û�н�");
		}
	}
}