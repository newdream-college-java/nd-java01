/*�ÿͻ���Ա�Ű�λΪ���ݱȶ���������г齱*/
import java.util.Scanner;
public class Hw07{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//��ʾ
		System.out.println("�������ع������ϵͳ>���˳齱");
		//��ʾ2
		System.out.print("������4λ��Ա��");
		int num = input.nextInt();
		int bw=num/100%10;
		//��ȡ���������
		int snum=(int)(Math.random()*10);
		if(bw==snum){
			System.out.print(num+"�ſͻ������˿ͻ�����þ���MP3һ����");
		}else{
			System.out.print(num+"�ſͻ�û�н�!");

		}
	}
}