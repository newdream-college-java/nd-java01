import java.util.Scanner;
public class Sa{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("����3������");
	int a =input.nextInt();
	int b =input.nextInt();
	int c =input.nextInt();
	if(a==b&&b==c){
		System.out.println("��3�������");	
	}else if((a+b+c)>1000){
		System.out.println("֮�ʹ���1000");

	}else {
		System.out.println("��3����֮�Ͳ�����1000");
	}


	}


}