import java.util.Scanner;
public class D01{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("-----------------------------------------\n��¼�˵�����һ������\n1.��¼ϵͳ\n2.�˳�\n��ѡ����Ҫ��¼�Ĳ˵�");
		//int a = input.nextInt();
		switch(input.nextInt()){
			case 1:
				System.out.println("-----------------------------------------\n��¼�˵����ڶ�������\n1.�ͻ���Ϣ����\n2.�������\n3.�������\n4.ע��\n");
				break;		
			case 2:
				System.out.println("-----------------------------------------\nллʹ��");
				break;
			default:
				System.out.println("�������");
				break;
		}
		System.out.println("��ѡ����Ҫ��¼�Ĳ˵�");
		switch(input.nextInt()){
				case 1:
					System.out.println("-----------------------------------------\n�������ϵͳ>�ͻ���Ϣ����\n1.��ʾ���пͻ���Ϣ\n2.��ӿͻ���Ϣ\n3.�޸Ŀͻ���Ϣ\n4.��ѯ�ͻ���Ϣ");
					break;
				case 3:
					System.out.println("-----------------------------------------\n�������ϵͳ>�������\n1.���˴����\n2.���˴�齱\n3.�����ʺ�");
					break;
				default :
					System.out.println("�������");
					break;
		}
	}
}
