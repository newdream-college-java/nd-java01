/*����һ����λ�����������ǲ��ǽ������磺531�ǽ����� ��λ>ʮλ>��λ*/
import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("������һ����λ������");
	int a=input.nextInt();
	int b=a/100%10,c=a/10%10,d=a%10;
	if(b>c&&c>d){
		System.out.print("�ǽ�����");
		}
	}
}