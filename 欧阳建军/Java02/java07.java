import java.util.Scanner;
public class java07{	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("****************���ѵ�*****************");
		System.out.println("����\t��Ʒ����\t����\t���");
		System.out.println("T��\t��245\t\t2\t��490");
		System.out.println("����Ь\t��570\t\t1\t��570");
		System.out.println("������\t��320\t\t1\t��320");
		int a=input.nextInt();//�ܽ��
		int b=490;//T��
		int c=570;//����Ь
		int d=320;//������
		double e=0.8;
		double f=(b+c+d)*e;//�����ܽ��
		double g=a-f;//��Ǯ
		int h=(int)f/100*3;//����
		System.out.print("\n�ۿۣ�\t\t\t8��"+"\n�����ܽ��\t\t��"+f+"\nʵ������\t\t��"+a+"\n��Ǯ\t\t\t��"+g+"\n���ι�������Ļ��֣�\t"+h);
		
			




	}




}