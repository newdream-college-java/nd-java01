/*����һ��С����Ȼ��������������ֺ�С�����֣���ʽ����
С��	��������	С������
3.14	3		0.14*/
import java.util.Scanner;
public class Al{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("������һ��С��:");
	double number=input.nextDouble();
	double a,b;
	a=(int)number;
	b=number-a;
	System.out.print("С��\t��������\tС������\n\n"+number+"\t"+a+"\t\t"+b);
	}

}