import java.util.Scanner;


public class zuoye2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		Scanner input=new Scanner(System.in);
		double[] arr=new double[5];
		System.out.println("�������Ա���µ����Ѽ�¼");
		for(int i=0;i<arr.length;i++){
			System.out.print("�������"+(i+1)+"������:");
			double a=input.nextDouble();
			arr[i]=a;
			sum+=a;
			
			
		}System.out.println("���\t\t���(Ԫ)");
		for(int j=0;j<5;j++){
			
			System.out.println((j+1)+"\t\t"+arr[j]);
		}
		System.out.println("���Ĺ����ܽ��Ϊ"+sum);
		
	}

}
