import java.util.Scanner;
public class Test2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double[] a;
		a=new double[5];
		int j=1,b=1;
		double sum=0;
		for(int i=0;i<a.length;i++){
			System.out.print("\n�������"+j+"�ʹ����");
			a[i]=input.nextDouble();
			sum+=a[i];
			j++;
		}
		System.out.println("���\t\t\t��Ԫ��");
		for(int i=0;i<a.length;i++){
			System.out.print("\n"+b+"\t\t\t"+a[i]);
			b++;
		}
		System.out.println("\n�ܽ��\t\t\t"+sum);
	}
}