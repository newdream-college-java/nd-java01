import java.util.Scanner;
public class Hw01{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("��¼�˵�����һ������"+"\n\n"+"1.��¼ϵͳ"+"\n"+"2.�˳�");
		System.out.print("��ѡ��");
		int a =input.nextInt();
		switch(a){
			case 1:
			System.out.print("\n\n"+"���˵����ڶ�������"+"\n\n"+"1.�ͻ���Ϣ����"+"\n"+"2.�������"+"\n"+"3.�������"+"\n"+"4.ע��");
			break;
			case 2:
			System.out.print("лл����ʹ��");
			break;
			default:
			
		}
		System.exit(-1);
	}
}