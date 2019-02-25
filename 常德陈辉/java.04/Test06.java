/*编程实现迷你计算机：支持+，-，*，/，从控制台输入2个操作数，输出运算结果*/
import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("请输入算术符号1，+\t2，-\t3，*\t4，/");
	double symbol=input.nextDouble();
	System.out.print("请输入数值a:");
	double a=input.nextDouble();
	System.out.print("请输入数值b:");
	double b=input.nextDouble();
	double price;
	if(symbol==1){
		price=a+b;
		System.out.print(a+"+"+b+"="+price);
		}if(symbol==2){
		price=a-b;
		System.out.print(a+"-"+b+"="+price);
		}if(symbol==3){
		price=a*b;
		System.out.print(a+"*"+b+"="+price);
		}if(symbol==4){
		price=a/b;
		System.out.print(a+"/"+b+"="+price);
		}
	}

}