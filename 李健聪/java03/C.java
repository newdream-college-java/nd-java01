import java.util.Scanner;
public class C{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("��������������");
		int s=input.nextInt();
		int a=123456,b=123789;
		if(s==a){
			System.out.print("��һ������ͨ����֤�����������ĵڶ�������");
			int d=input.nextInt();
			if(d==b){
				System.out.print("�ڶ���������֤ͨ���������Խ��д�ȡ�������");
				
			}else {
				System.out.print("������˼Ŷ�����ĵڶ�������������ͷ��ʼ");
			}
			
		}else{
				System.out.print("������������¿�ʼ");
			}
	}
		
}
