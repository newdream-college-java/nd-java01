/*�Ա�����ʽ���5�ʹ�����ܽ�� ����һ������Ϊ5��double����������洢������ѭ��������ʹ�������ۼ��ܽ������ѭ�������ʹ�����������ܽ��*/
import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=5;
		double sum=0;
		double[] b=new double[a];
		for(int i=0;i<5;i++){
			System.out.print("�������"+(i+1)+"�ʹ����");
			b[i]=input.nextDouble();
			sum+=b[i];
		}
		System.out.println("\n���\t��Ԫ��");
		for(int i=0;i<5;i++){
			System.out.println((i+1)+"\t"+b[i]);
		}
		System.out.println("�ܽ��\t"+sum);		
	}
}