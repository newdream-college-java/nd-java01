/**
**����һ����λ�����������ǲ��ǽ�������:531 �ǽ�����  ��λ>ʮλ>��λ 
**/
import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ����λ����");
		int a=-1;
		while(true){
			if(input.hasNextInt()){
				a=input.nextInt();
				break;
			}
			else{
				System.out.println("����Ĳ�����λ����������������");
			}
		}
		int b=a%10;
		int c=a/10%10;
		int d=a/100;
		if((d>c)&&(c>b)){
			System.out.println(a+"��һ��������");
		}else{
			System.out.println(a+"����һ��������");
		}					
	}
}