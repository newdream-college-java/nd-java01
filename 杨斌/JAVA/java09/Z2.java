import java.util.Scanner;
public class Z2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("�������Ա���µ����Ѽ�¼:");
		double[] a=new double[5];
		double sum=0;
		for(int i=0;i<a.length;i++){
			System.out.println("�������"+(i+1)+"�ʹ�����");
			a[i]=input.nextDouble();
		}
		System.out.println("\n���\t\t���(Ԫ)");
		for(int i=0;i<a.length;i++){			
			System.out.println(i+1+"\t\t"+a[i]);
			sum+=a[i];
		}
		System.out.println("�ܽ��\t\t"+sum);
	}
}