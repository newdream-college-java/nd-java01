import java.util.Scanner;
public class E{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("��ֱ�������������");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		if(a==b&&a==c){
			System.out.println("�����������");
		}else if((a+b+c)>1000){
			System.out.println("��������֮�ʹ���1000");
		}else{
			System.out.println("��������֮�Ͳ�����1000");
		}


	}
}