import java.util.Scanner;
public class A{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("��¼�˵�����һ������");
		System.out.println("1����¼ϵͳ");
		System.out.println("2���˳�");
		int sum=input.nextInt();
		switch(sum){
			case 1:
				System.out.println("���˵����ڶ�������");
				System.out.println("1���ͻ���Ϣ����");
				System.out.println("2���������");
				System.out.println("3���������");
				System.out.println("4��ע��");
				int a=input.nextInt();
				
			switch(a){
				case 1:
					System.out.println("�������ϵͳ>�ͻ���Ϣ����");
					System.out.println("1����ʾ���пͻ���Ϣ");
					System.out.println("2����ӿͻ���Ϣ");
					System.out.println("3���޸Ŀͻ���Ϣ");
					System.out.println("4����ѯ�ͻ���Ϣ");
					break;
				case 3:
					System.out.println("�������ϵͳ>�������");
					System.out.println("1�����˴����");
					System.out.println("2�����˳齱");
					System.out.println("3�������ʺ�");
					break;
				default:
					System.out.println("�������");
					break;
			}
				break;
			case 2:
				System.out.println("лл����ʹ��");
				break;
			default:
				System.out.println("�������");
				break;
		}
	
	}
}