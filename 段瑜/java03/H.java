import java.util.Scanner;
public class H{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("�������һ�����룺");
		int a=input.nextInt();
		int b=135790,c=246810;
		if(a==b){
			System.out.println("������ڶ������룺");
			int d=input.nextInt();
			if(d==c){
				System.out.println("��ϲ���õ�Ǯ�ˣ�����");
			}else{
				System.out.println("�ڶ����������");
			}
			}else{
				System.out.println("��һ���������");
			}
		}
}