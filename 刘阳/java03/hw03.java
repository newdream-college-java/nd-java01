import java.util.Scanner;
public class hw03{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������һ�����룺");
		int pW01=input.nextInt();
		//System.out.print("������ڶ������룺");
		//int pW02=input.nextInt();
		if(pW01==123456){
			System.out.print("������ڶ������룺");
			int pW02=input.nextInt();
			if(pW02==654321){
				System.out.print("��ϲ�õ�Ǯ�ˣ�");
			}else{
				System.out.print("��2���������");
			}
				
		}else{
			System.out.print("��һ���������");
		}
			
	}

}