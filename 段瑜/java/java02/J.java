import java.util.Scanner;
public class J{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("T��\t\t��245\t2\t\t��490");
		System.out.println("����Ь\t\t��570\t1\t\t��570");
		System.out.println("T��\t\t��320\t1\t\t��320");
		System.out.println("֧����");
		int a=input.nextInt();
		int b=490;
		int c=570;
		int d=320;
		double h=8;
		double e=(d+b+c)*h/10;
		int f=(int)e/100*3;
		double g=a-e;
		System.out.println("�ۿۣ�\t\t\t"+h+"��");
		System.out.println("�����ܽ�\t\t��"+e);
		System.out.println("��Ǯ��\t\t\t��"+g);
		System.out.println("���ι�������Ļ����ǣ�\t"+f);
}
}