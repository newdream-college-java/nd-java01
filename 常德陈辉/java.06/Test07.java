/*ѭ���������0�����ֽ����ۼӣ�ֱ�����������Ϊ0���ͽ���ѭ�������������ۼӵĽ��*/
import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("�������S����");
	double a=input.nextDouble();
	double num=0;
	for( ;a!=0;){
		System.out.print("�����뱻�ӵ�����");
		num+=a;
		a=input.nextDouble();
		}
	System.out.print("��Ϊ��"+num);
	}

}