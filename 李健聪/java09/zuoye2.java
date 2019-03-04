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
		System.out.println("请输入会员本月的消费记录");
		for(int i=0;i<arr.length;i++){
			System.out.print("请输入第"+(i+1)+"购物金额:");
			double a=input.nextDouble();
			arr[i]=a;
			sum+=a;
			
			
		}System.out.println("序号\t\t金额(元)");
		for(int j=0;j<5;j++){
			
			System.out.println((j+1)+"\t\t"+arr[j]);
		}
		System.out.println("您的购物总金额为"+sum);
		
	}

}
