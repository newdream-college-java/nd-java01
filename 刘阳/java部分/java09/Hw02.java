import java.util.Scanner;
public class Hw02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入会员本月的消费记录：");
		double[] a=new double[5];
		double sum=0;
		for(int i=1;i<=a.length;i++){
			System.out.print("请输入第"+i+"笔购物金额:");
			a[i-1]=input.nextDouble();
			sum+=a[i-1];
		}
		System.out.println("序号\t\t"+"金额(元)");
		for(int i=1;i<=(a.length+1);i++){
			if(i==6){
				
				System.out.print("总金额\t\t"+sum);
			}else{
				System.out.println(" "+i+"\t\t"+a[i-1]);
			}
		}
	}
}