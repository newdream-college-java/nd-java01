/*����һ����λ������ÿλ�ϵ���*/
import java.util.Scanner;
public class java03{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("����һ����λ����");
	int n = input.nextInt();
	int gw = n%10;
	int sw = n/10%10;
	int bw = n/100%10;
	int qw = n/1000;
	System.out.println("��λΪ��"+gw+"ʮλΪ��"+sw+"��λΪ��"+bw+"ǧλΪ��"+qw);
	}
}