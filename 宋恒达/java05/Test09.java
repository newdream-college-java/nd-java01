/**
**����ϵͳ���˵�����ʾ�û��������֣�����ѡ�������Ӧģ��
**�û����������Ҫ���ظ����룬ֱ��������ȷ��ִ����Ӧ���ܺ��˳�ѭ��
**/
import java.util.Scanner;
public class Test09{
	public static void main(String[] args){
		boolean flag=true;
		Scanner input=new Scanner(System.in);
		System.out.println("*************************************");
		System.out.println("\t1.�ͻ���Ϣ����");
		System.out.println("\t2.�������");
		System.out.println("\t3.�������");
		System.out.println("\t4.ע��");
		System.out.println("*************************************");
		System.out.println();
		System.out.println();
		System.out.print("��ѡ��,��������:");
		do{
				int a=input.nextInt();
				if((a>=1)&&(a<=4)){
					System.out.println("ִ�й������");
					System.out.println("�������");
					flag=false;
				}else{
					System.out.print("�������,��������������:");
					continue;
				}	
		}while(flag);
	}
}