/**
**���ʵ�ֽ����û����������������������Ľ׳ˡ����磺��������4����
**���4��=4*3*2*1=24.Ҫ����������1~10��������ʾ����
**/
import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=-1;
		while(true){	
			a=-1;
			System.out.print("������һ��1~10��������:");
			a=input.nextInt();
			if((a>=1)&&(a<=10)){
				break;
			}else{
			System.out.println("�������");
			}
		}
		int sum=a;
		System.out.print(a);
		for(int i=a-1;i>=1;i--){
			sum*=i;
			System.out.print("*"+i);
		}
		System.out.println("="+sum);
	}
}