import java.util.Scanner;
public class H{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		System.out.print("������3��������\t");
		int  a = input.nextInt();
		int  b = input.nextInt();
		int  c = input.nextInt();
		int temp;
		System.out.print("����֮ǰ��ֵ"+a+"\t"+b+"\t"+c);
		if(a<b){
			temp=a;
			a=b;
			b=temp;
		}if(a<c){
			temp=a;
			a=c;
			c=temp;
		}
		if(b<c){
			temp=b;
			b=c;
			c=temp;
		}
		
		System.out.println("���������ɴ�С�����"+a+"\t"+b+"\t"+c);
	}
}
  