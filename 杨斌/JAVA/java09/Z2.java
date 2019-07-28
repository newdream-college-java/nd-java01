import java.util.Scanner;
public class Z2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入会员本月的消费记录:");
		double[] a=new double[5];
		double sum=0;
		for(int i=0;i<a.length;i++){
			System.out.println("请输入第"+(i+1)+"笔购物金额");
			a[i]=input.nextDouble();
		}
		System.out.println("\n序号\t\t金额(元)");
		for(int i=0;i<a.length;i++){			
			System.out.println(i+1+"\t\t"+a[i]);
			sum+=a[i];
		}
		System.out.println("总金额\t\t"+sum);
	}
}