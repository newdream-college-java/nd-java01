/**
**ѭ���������0�����ֽ����ۼ�
**֪�����������Ϊ0���ͽ���ѭ�������������ۼӽ��
**/
import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		boolean flag=true;
		double sum=0;
		double a=-1;
		do{
			System.out.println("���������0���ۼ����֣���������0�˳�����:");
			a=input.nextDouble();
			if(a==0){
				flag=false;
			}else{
				sum+=a;
			}
		}while(flag);
		System.out.println("�ۼӺ�Ϊ"+sum);
	}
}