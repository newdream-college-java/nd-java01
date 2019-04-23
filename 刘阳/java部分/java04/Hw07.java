import java.util.Scanner;
public class Hw07{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎使用迷你计算器"+"\n"+"请选择你要执行的运算："+"\n"+"1.加法"+"\n"+"2.减法"+"\n"+"3.乘法"+"\n"+"4.除法");
		int fh=input.nextInt();
		double ans,a,b;
		switch(fh){
			case 1:
				System.out.print("请输入要相加的两个数：");
				a=input.nextDouble();
				b=input.nextDouble();
				ans=a+b;
				System.out.print("结果为："+ans);
			break;
			case 2:
				System.out.print("请输入要相减的两个数：");
				System.out.print("请输入被减数：");
				a=input.nextDouble();
				System.out.print("请输入减数：");
				b=input.nextDouble();
				ans=a-b;
				System.out.print("结果为："+ans);
			break;
			case 3:
				System.out.print("请输入要相乘的两个数：");
				System.out.print("请输入第一个乘数：");
				a=input.nextDouble();
				System.out.print("请输入第二个乘数：");
				b=input.nextDouble();
				ans=a*b;
				System.out.print("结果为："+ans);
			break;
			case 4:
				System.out.print("请输入要相除的两个数：");
				System.out.print("请输入被除数：");
				a=input.nextDouble();
				System.out.print("请输入除数：");
				b=input.nextDouble();
				ans=a/b;
				System.out.print("结果为："+ans);
			break;
			default:
				System.out.print("选择运算不规范：");
		}
	}
}