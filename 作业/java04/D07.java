import java.util.Scanner;
public class D07{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("�������һ����");
	double a = input.nextDouble();
	System.out.println("������+����-����*����/��ĳһ�������");
	String cal=input.next();
	System.out.println("������ڶ�����");
	double b = input.nextDouble();
	if(cal.equals("+")){
		System.out.println(a+"+"+b+"="+(a+b));
	}else if(cal.equals("-")){
		System.out.println(a+"-"+b+"="+(a-b));
	}else if(cal.equals("*")){
		System.out.println(a+"*"+b+"="+(a*b));
	}else if(cal.equals("/")){
		System.out.println(a+"/"+b+"="+(a/b));
	}
	}
}
