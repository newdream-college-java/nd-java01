import java.util.Scanner; //���ݴ������
public class AT10{
	public static void main(String[] main){
		Scanner input = new Scanner(System.in);
		System.out.print("���������Ĵ��\t");
		double ck = input.nextDouble();
		if(ck>5000000){
			System.out.println("�������򿭵�����");
		}else if(ck>1000000){
			System.out.println("��������������");
		}else if(ck>500000){
			System.out.println("��������������");
		}else if(ck>100000){
			System.out.println("�����������");
		}else   	System.out.println("�㻹����ݰ��ذ�");
	}
}