import java.util.Scanner;
public class Hw02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������Ա���µ����Ѽ�¼��");
		double[] a=new double[5];
		double sum=0;
		for(int i=1;i<=a.length;i++){
			System.out.print("�������"+i+"�ʹ�����:");
			a[i-1]=input.nextDouble();
			sum+=a[i-1];
		}
		System.out.println("���\t\t"+"���(Ԫ)");
		for(int i=1;i<=(a.length+1);i++){
			if(i==6){
				
				System.out.print("�ܽ��\t\t"+sum);
			}else{
				System.out.println(" "+i+"\t\t"+a[i-1]);
			}
		}
	}
}