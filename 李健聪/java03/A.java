import java.util.Scanner;
public class A{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��3λ����");
		int zs=input.nextInt();
		int a=zs/100%10,b=zs/10%10,c=zs%10;
		if(a>b&&a>c){
			System.out.println(zs+"�ǽ�����");
		}else{
			System.out.println(zs+"���ǽ�����");
		}
	}
}