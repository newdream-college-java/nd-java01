/**
**输入10个整数，合法值为1、2、3.不是这三个数则为非法数字。编程统计每个整数和非法数字的个数
**/
import java.util.Scanner;
public class Test05{
	public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
		//创建长度为10的数组
		int[] a=new int[10];
		int sum1=0;//用来存储合法数字的个数
		int sum2=0;//用来存储非法数字的个数
		//从键盘输入10个数字存入数组
		for (int i=0;i<a.length;i++) {
			System.out.print("请输入第"+i+"个数字:");
			int b=input.nextInt();
			a[i]=b;
		}
		//循环判断每个数字是否为非法数字
		for (int i=0;i<a.length ;i++ ) {
			if(a[i]==1||a[i]==2||a[i]==3){
				sum1++;
			}else {
				sum2++;
			}
		}
		//输出合法值和非法整数的个数
		System.out.print("合法数字个数为:"+sum1+"\n非法整数为:"+sum2);
	}
}