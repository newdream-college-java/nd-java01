import java.util.Scanner;
public class Java1_2{
	public static void main(String[] args){
		double[] arr =new double[5];
		double sum=0;
		Scanner input = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			System.out.println("请输入"+(i+1)+"笔购物金额");
			arr[i]=input.nextDouble();
			sum+=arr[i];
		}
		System.out.println("序号\t\t金额(元)");
		for(int i=0;i<arr.length;i++){
			System.out.println((i+1)+"\t\t"+arr[i]);
		}
		System.out.println("总金额\t\t"+sum);
	}
}