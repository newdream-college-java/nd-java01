import java.util.Scanner;
public class D{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int d,c=input.nextInt();	
		System.out.println("����֮ǰ��ֵ��"+a+"\t"+b+"\t"+c);
		//ʹ��if�ṹ�ظ��Ƚ�����
		if(a>b){
			d=a;
			a=b;
			b=d;
		}
		if(a>c){
			d=a;
			a=c;
			c=d;
		}
		if(b>c){
			d=b;
			b=c;
			c=d;
		}
		System.out.println("����֮���ֵ��"+a+"\t"+b+"\t"+c);
}
}