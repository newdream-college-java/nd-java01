import java.util.Scanner;
public class java03{
	public static void main(String[] args){
	System.out.println("������һ������n����ӡ��һ��n��������");
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
		//����һ����i��
	for(int i=1;i<=n;i++){
		//����ÿ�еĿո���
		for (int xx=n-1;xx>=i;xx--){
			System.out.print(" ");
		}
		//����ÿ�е�������
		for(int j=1;j<=2*i-1;j++){
			System.out.print("*");
		}
		//���ƴ�ӡ��ÿ�еĿո�����Ǻ���
		System.out.println();
	}
	}
}