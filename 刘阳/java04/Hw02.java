import java.util.Scanner;
public class Hw02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�����������������");
		int a = input.nextInt();
		if(a>5){
			a=a+2;
			System.out.print("��������"+a+"�����ӡ�");
		}else if(a>=3){
			a=a+1;
			System.out.print("��������"+a+"�����ӡ�");
		}else{
			System.out.print("��������"+a+"�����ӡ�");
		}
	}
}