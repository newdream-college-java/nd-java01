/*以表格的形式输出5笔购物金额及总金额 创建一个长度为5的double类型数数组存储购物金额循环输入五笔购物金额，并累加总金额利用循环输出五笔购物金额，最后输出总金额*/
import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=5;
		double sum=0;
		double[] b=new double[a];
		for(int i=0;i<5;i++){
			System.out.print("请输入第"+(i+1)+"笔购物金额：");
			b[i]=input.nextDouble();
			sum+=b[i];
		}
		System.out.println("\n序号\t金额（元）");
		for(int i=0;i<5;i++){
			System.out.println((i+1)+"\t"+b[i]);
		}
		System.out.println("总金额\t"+sum);		
	}
}