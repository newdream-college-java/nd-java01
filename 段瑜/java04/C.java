import java.util.Scanner;
public class C{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("��ѩ�μӼ������̴�����ã�");
		int sum=input.nextInt();
		switch(sum){
			case 1:
				System.out.println("�μ���ʡ����ѧ��֯��1������Ӫ");
				break;
			case  2:
				System.out.println("���������ձʼǱ�����һ��");
				break;
			case 3:
				System.out.println("�������ƶ�Ӳ��һ��");
				break;
			default:
				System.out.println("���ź���û�л�ý���");
		}
	}
}