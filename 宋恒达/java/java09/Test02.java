/**
**以表格的形式输出5笔购物金额及总金额，创建一个长度为5的double类型数组存储
**购物金额，循环输入五笔购物金额，并累加总金额，利用循环输出五笔购物金额，
*最后输出总金额
**/
import java.util.Scanner;
public class Test02{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//创建double类型数组
		double[] cash=new double[5];
		double sum=0.0;//用来存储总金额
		//1.循环输入购物金额
		//2.存入数组
		//3.累加金额
		System.out.println("请输入会员本月的消费记录");
		for (int i=0;i<cash.length ;i++ ) {
			System.out.print("请输入第"+(i+1)+"笔购物金额：");
			double singleCash=input.nextDouble();
			cash[i]=singleCash;
			sum+=singleCash;
		}
		//输出五笔购物金额
		System.out.println("序号\t\t金额(元)");
		for (int i=0;i<cash.length ;i++ ) {
			System.out.println((i+1)+"\t\t"+cash[i]);
		}
		//输出总金额
		System.out.println("总金额"+"\t\t"+sum);
	}
}