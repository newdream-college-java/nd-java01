import java.util.Scanner;
public class Java1_2{
	public static void main(String[] args){
		double[] arr =new double[5];
		double sum=0;
		Scanner input = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			System.out.println("������"+(i+1)+"�ʹ�����");
			arr[i]=input.nextDouble();
			sum+=arr[i];
		}
		System.out.println("���\t\t���(Ԫ)");
		for(int i=0;i<arr.length;i++){
			System.out.println((i+1)+"\t\t"+arr[i]);
		}
		System.out.println("�ܽ��\t\t"+sum);
	}
}