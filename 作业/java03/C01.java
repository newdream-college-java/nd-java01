import java.util.Scanner;
public class C01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ����λ������:");
		int j=input.nextInt();
		int a=j%10,b=j/10%10,c=j/100%10;
		if(c>b&&b>a){
			System.out.print("�ǽ�����");

		}else{
			System.out.print("���ǽ�����");



		}
		







		}



}
