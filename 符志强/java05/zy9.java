import java.util.Scanner;
public class zy9{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("MyShopping����ϵͳ>�������");
		System.out.println("************************************");
		System.out.println("��ѡ������Ʒ��ţ�"+"\n1.T��"+"\t2.����Ь"+"\t3.������");
		System.out.println("************************************");
		System.out.print("��������Ʒ��ţ�");
		int bh=input.nextInt();
		System.out.print("�����빺��������");
		int sl=input.nextInt();
		double a=245.0,b=570.0,c=320.0,h=0;	
		while(bh>=1&&bh<=3){
			if(bh==1){
				System.out.println("T��\t��"+a);
				
				System.out.print("������"+sl);
				h=a*sl;
				System.out.print("�ϼƣ���"+h);
				System.out.print("�Ƿ������y/n��");
				String yn=input.next();
				if(yn.equals("n")){
					System.out.println("�ۿۣ�\t0.8");
					System.out.println("Ӧ����"+h);
					System.out.println("��������ʵ���Ľ��");
					System.out.print("ʵ����");
					double sf=input.nextDouble();
					double zq=sf-h;
					System.out.println("��Ǯ��"+zq);
					break;
				}
			}
			if(bh==2){
				System.out.println("����Ь\t��"+b);
				System.out.print("������"+sl);
				h=b*sl;
				System.out.print("�ϼƣ���"+h);
				System.out.print("�Ƿ������y/n��");
				String yn=input.next();
				if(yn.equals("n")){
					System.out.println("�ۿۣ�\t0.8");
					System.out.println("Ӧ����"+h);
					System.out.println("��������ʵ���Ľ��");
					System.out.print("ʵ����");
					double sf=input.nextDouble();
					double zq=sf-h;
					System.out.println("��Ǯ��"+zq);
					break;
				}
			}
			if(bh==3){
				System.out.println("������\t��"+c);
				System.out.print("������"+sl);
				h=c*sl;
				System.out.print("�ϼƣ���"+h);
				System.out.print("�Ƿ������y/n��");
				String yn=input.next();
				if(yn.equals("n")){
					System.out.println("�ۿۣ�\t0.8");
					System.out.println("Ӧ����"+h);
					System.out.println("��������ʵ���Ľ��");
					System.out.print("ʵ����");
					double sf=input.nextDouble();
					double zq=sf-h;
					System.out.println("��Ǯ��"+zq);
					break;
				}
			}
		}
	}
}