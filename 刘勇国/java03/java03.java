import java.util.Scanner;
public class java03{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int passWord1 = 123456;
	int passWord2 = 654321;
	System.out.println("�������һ������");
	int inputPassWord1 = input.nextInt();
	if(inputPassWord1==passWord1){
		System.out.println("������ڶ�������");
		int inputPassWord2 = input.nextInt();
		if(inputPassWord2==654321){
			System.out.println("���õ���Ǯ");
		}else{
			System.out.println("�ڶ����������");
		}
	}else{
		System.out.println("��һ���������");
	}
	}
}