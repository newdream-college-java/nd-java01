/**
**�û��������޵��������֣���ͳ���û�����������������ĸ����������ĸ���
**��0�ĸ�����ֱ���û�����999�ͽ��������ͳ�ƽ��
**/
import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum1=0;
		int sum2=0;
		int sum3=0;
		while(true){
			System.out.print("������һ������������999������:");
			int a=input.nextInt();
			if(a==999){
				break;
			}
			else if(a>0){
				sum1++;
			}else if(a==0){
				sum2++;
			}else if(a<0){
				sum3++;
			}
		}
		System.out.println("��������Ϊ"+sum1+"\t��������Ϊ"+sum3+"\t0����Ϊ"+sum2);
	}
}