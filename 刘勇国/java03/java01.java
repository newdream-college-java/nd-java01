import java.util.Scanner;
public class java01{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("������1��3λ����");
	int n = input.nextInt();
	int gw = n%10;
	int sw = n/10%10;
	int bw = n/100;
	if(bw>sw||sw>gw){
		System.out.println("�ǽ�����");
	}else{
		System.out.println("����");
	}
	}
}