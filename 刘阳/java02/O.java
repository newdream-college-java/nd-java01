import java.util.Scanner;
public class O{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("��������һ��С��:");
		//����һ��С��
		double a=input.nextDouble();
		int b=(int)a;
		double c=a-b;
		System.out.println("С��"+"\t"+"��������"+"\t"+"С������");
		System.out.print(a+"\t  "+b+"\t\t"+String.format("%.2f",c));//����С�������λС��
	}
}		