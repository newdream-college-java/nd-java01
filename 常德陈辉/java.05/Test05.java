/*ѭ����Ҫ���û�����һ��0��2֮���������
����������0��������������ʯͷ����
����������1�������������Ǽ�������
����������2�������������ǲ�����
������������ͽ�������*/
import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("������0��2֮���һ������");
	int n=input.nextInt();
	int i;
	for(i=n;i<3;i=n){
		switch(n){
			case 0:
				System.out.print("�������ʯͷ\t���ٴ�����");
				break;
			case 1:
				System.out.print("������Ǽ���\t���ٴ�����");
				break;
			case 2:
				System.out.print("������ǲ�\t���ٴ�����");
				break;
			}
			n=input.nextInt();
		}
		System.out.print("�������");
	}

}