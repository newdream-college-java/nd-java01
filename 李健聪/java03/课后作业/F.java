import java.util.Scanner;
public class F{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��int�͵�����");
		int a = input.nextInt();
		if(a%2==0){
			System.out.println("�������ż��");
		}else{
			System.out.println("�����������");	
		}
	}
}