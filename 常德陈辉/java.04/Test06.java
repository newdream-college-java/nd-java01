/*���ʵ������������֧��+��-��*��/���ӿ���̨����2�������������������*/
import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("��������������1��+\t2��-\t3��*\t4��/");
	double symbol=input.nextDouble();
	System.out.print("��������ֵa:");
	double a=input.nextDouble();
	System.out.print("��������ֵb:");
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