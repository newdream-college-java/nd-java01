import java.util.Scanner;
public class I{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double sj=input.nextDouble();
 		System.out.println("***********���ѵ�************");
		System.out.print("������Ʒ");
		System.out.print("\t����");
		System.out.print("\t����");
		System.out.println("\t���");
		System.out.print("T��");
		int a=245,a1=2,a2=a*a1;
		System.out.print("\t\t��"+a);
		System.out.print("\t"+a1);
		System.out.println("\t��"+a2);

		System.out.print("����Ь");
		int b=570,b1=1,b2=b*b1;
		System.out.print("\t\t��"+b);
		System.out.print("\t"+b1);
		System.out.println("\t��"+b2);
		
		System.out.print("������");
		int c=320,c1=1,c2=c*c1;
		System.out.print("\t\t��"+c);
		System.out.print("\t"+c1);
		System.out.println("\t��"+c2);

		double zk=0.8,zje,zq,jf;
	
		System.out.println("�ۿۣ�\t\t8��");
		zje=a2+b2+c2;
		System.out.println("�����ܽ��\t\t��"+zje);
		
		System.out.println("ʵ�ʽ���\t\t��"+sj);
		jf=zje/100*3;
		System.out.println("���ι�������Ļ����ǣ�"+jf);
		System.out.println();

	}
}