import java.util.Scanner;
public class C03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("�������һ�����룺");
		int mi=input.nextInt();
		int dy=123456,de=654321;
		if(mi==dy){
			System.out.print("������ڶ������룺");
			int me=input.nextInt();
			if(me==de){
				System.out.print("������ȷ");

			}else{

				System.out.print("�ڶ����������");

			}		

		}else{
			System.out.print("��һ���������");
			
		}



	}



}
