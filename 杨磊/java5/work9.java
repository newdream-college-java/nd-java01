import java.util.*;
public class work9{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print("��ӭʹ��MyShopping����ϵͳ \n\n\t1.�ͻ���Ϣ����\n\t2.�������\n\t3.�������\n\t4.ע��\n");
		for(;;){
			System.out.println("��ѡ���������֣�");
			int m = input.nextInt();
			switch(m){
				case 1:
					System.out.print("\t�ͻ���Ϣ����\n\n");
					break;
				case 2:
					System.out.print("\t�������\n\n");
					System.out.print("��ѡ�������Ʒ��ţ�\n1.T��\t2.����Ь\t3.������\n");
					System.out.print("��������Ʒ��ţ�");
					int a=input.nextInt();
					System.out.print("�����빺��������");
					int b=input.nextInt();
					double c= 0,f=0;
					switch(a){
						case 1:
							f=245.0;
							break;
						case 2:
							f=570.0;
							break;
						case 3:
							f=320.0;
							break;
						default:
							System.out.print("�������");
							break;
					}
					System.out.print("�������ۿۣ�");
					double d=input.nextDouble();
					c = f*b*d;
					System.out.println("Ӧ����"+ c);
					System.out.print("ʵ����");
					double e=input.nextDouble();
					System.out.print("\n");
					System.out.print("��Ǯ:"+(e-c));
					break;
				case 3:
					System.out.print("\t�������\n\n");
					break;
				case 4:
					System.out.print("ע��");
					break;
				default:
					System.out.print("�������");
					break;
			}
		}
	}
}