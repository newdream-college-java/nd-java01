import java.util.Scanner;
public class Ak{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("�������������������ѵ�����������������");
	System.out.println("������Ʒ\t����\t����\t���\nT��\t\t��245\t2\t��490\n����Ь\t\t��570\t1\t��570\n������\t\t��320\t1\t��320\n\n");
	double a,b,c,d;
	a=490+570+320;
	b=a*0.8;
	c=1500-b;
	d=b/100*3;
	d=(int)d;
	System.out.print("���\t\t8��\n�����ܽ��\t��"+b+"\nʵ�ʽɷ�\t��1500\n��Ǯ\t\t��"+c+"\n���ι����õĻ����ǣ�"+d);
	}

}