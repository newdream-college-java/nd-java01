/**
**ѭ�������ַ���������Щ������ַ���������������ֱ��������ַ���Ϊ��Esc���ͽ���ѭ���������ʾ���
**�����������ַ���
**���磺����abc ����def ����Esc
**�����abcdef
**/
import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String last="";
		while(true){
			System.out.print("�������ַ���:");
			String a=input.next();
			if(a.equals("Esc")){
				break;
			}
			last=last+a;
		}
		System.out.println(last);
	}
}