/**
**������һ�����б��չ����������롣���õ������Ǯ����������������붼Ҫ��ȷ�� 
�����һ�����붼����ȷ����ֱ�Ӱ����������棻�����һ������������ȷ��������Ȩ����� �������롣
ֻ�е��ڶ�������Ҳ������ȷ�������õ�Ǯ��(���������Լ��裬Ҫ�����볤�Ȳ� �ܵ��� 6 λ) 
**/
import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("�������һ������:");
		String firstPassword=input.next();
		if(firstPassword.equals("123456")){
			System.out.print("������ڶ�������:");
			String secondPassword=input.next();
			if(secondPassword.equals("654321")){
				System.out.println("��ϲ�õ�Ǯ��");
			}else{
				System.out.println("�ڶ����������");
			}
		}else{
			System.out.println("��һ���������");
		}
	}
}