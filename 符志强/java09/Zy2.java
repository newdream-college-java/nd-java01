import java.util.Scanner;
public class Zy2{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		double[] a=new double[5];
		double sum=0;
		System.out.println("�������Ա���µ����Ѽ�¼");
		
		for(int i=0;i<a.length;i++){
			System.out.print("�������"+(i+1)+"�ʹ�����:");
			a[i]=input.nextDouble();
			sum+=i;
			
			
		}
		System.out.println("���\t\t\t��Ԫ��");
		for(int i=0;i<a.length;i++){
			System.out.println((i+1)+"\t\t\t"+a[i]);
		}
		System.out.println("�ܽ��\t\t\t"+sum);
	}
}