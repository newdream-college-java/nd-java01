/*��1�� ��ʡ��һ��������Ӫ
��2�� ���ձʼǱ�����һ��
��3�� �ƶ�Ӳ��һ��
���� �����κν���*/
import java.util.Scanner;
public class Hw03{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�����뺫�̻���˵ڼ�����"+"\t"+"��������������");
		//����ɼ�
		int sc= input.nextInt();
		if(sc==1){
			System.out.print("�����μ���ʡ����ѧ��֯��1��������Ӫ��");
		}else if(sc==2){
			System.out.print("������û��ձʼǱ�����һ����");
		}else if(sc==3){
			System.out.print("�����ƶ�Ӳ��һ����");
		}else{
			System.out.print("û���κν���");
		}
		
	}
}