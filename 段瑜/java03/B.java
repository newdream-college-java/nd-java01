import java.util.Scanner;
public class B{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("������һ������");
	int mun=input.nextInt();
	if(mun%2==0){
		System.out.println("�������ż��");
	}else{
		System.out.println("�����������");
	}
	}
}