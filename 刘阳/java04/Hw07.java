import java.util.Scanner;
public class Hw07{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭʹ�����������"+"\n"+"��ѡ����Ҫִ�е����㣺"+"\n"+"1.�ӷ�"+"\n"+"2.����"+"\n"+"3.�˷�"+"\n"+"4.����");
		int fh=input.nextInt();
		double ans,a,b;
		switch(fh){
			case 1:
				System.out.print("������Ҫ��ӵ���������");
				a=input.nextDouble();
				b=input.nextDouble();
				ans=a+b;
				System.out.print("���Ϊ��"+ans);
			break;
			case 2:
				System.out.print("������Ҫ�������������");
				System.out.print("�����뱻������");
				a=input.nextDouble();
				System.out.print("�����������");
				b=input.nextDouble();
				ans=a-b;
				System.out.print("���Ϊ��"+ans);
			break;
			case 3:
				System.out.print("������Ҫ��˵���������");
				System.out.print("�������һ��������");
				a=input.nextDouble();
				System.out.print("������ڶ���������");
				b=input.nextDouble();
				ans=a*b;
				System.out.print("���Ϊ��"+ans);
			break;
			case 4:
				System.out.print("������Ҫ�������������");
				System.out.print("�����뱻������");
				a=input.nextDouble();
				System.out.print("�����������");
				b=input.nextDouble();
				ans=a/b;
				System.out.print("���Ϊ��"+ans);
			break;
			default:
				System.out.print("ѡ�����㲻�淶��");
		}
	}
}