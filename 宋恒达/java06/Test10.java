/**
**ѭ��¼��3λ��Ա����Ϣ����Ա�źϷ�����ʾ¼����Ϣ��������ʾ¼��ʧ��
**/
import java.util.Scanner;
public class Test10{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=3;i++){
			System.out.print("�������Ա��<4λ����>:");
			int a=input.nextInt();
			System.out.print("�������Ա����(��/��<����λ������ʾ>)");
			String b=input.next();
			System.out.print("�������Ա����:");
			int c=input.nextInt();
			System.out.println("��¼��Ļ�Ա��Ϣ��:");
			System.out.println(a+"\t"+b+"\t"+c);
		}
		System.out.println();
		System.out.println("�������!");
}
}