import java.util.Scanner;
import java.util.Random;
public class java07{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("���������4λ����Ա��");
		int	num = input.nextInt();
		int a = num/10%10;
		Random rand = new Random();
		int i=rand.nextInt(10);
		System.out.println("�����������Ϊ��"+i);
		if(a==i){
			System.out.println("��ϲ��鵽�˽�Ʒ");
		}else{
			System.out.println("���ź���û����");
		}
	}
}