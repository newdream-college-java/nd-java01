/*���̲μӼ������̴���
�����õ�һ�������μ���ʡ����ѧ��֯��1��������Ӫ
�����õڶ��������������ձʼǱ�����һ��
�����õ����������ƶ�Ӳ��һ��
���򣬲����κν���*/
import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("�����뺫�̵����Σ�");
	int ranking=input.nextInt();
	switch(ranking){
		case 1:
			System.out.println("���μ���ʡ����ѧ��֯��1��������Ӫ");
			break;
		case 2:
			System.out.println("�������ձʼǱ�����һ��");
			break;
		case 3:
			System.out.println("�����ƶ�Ӳ��һ��");
			break;
		default:
			System.out.println("û�н���");
		}	
	}

}