import java.util.Scanner;
public class Hw05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//��ʾ
		System.out.print("����������������");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int sum=a+b+c;
		if((a!=b)||(b!=c)||(a!=c)){
			if(sum>1000){
				System.out.print("��������֮�ʹ���1000");
			}else{
				System.out.print("��������֮�Ͳ�����1000");
			}
		}else{
			System.out.print("�����������");
		}
	}
}