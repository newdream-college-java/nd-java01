/**
*����һ����ݣ��������껹��ƽ�� 
**/
import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		System.out.print("���������");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		if((a%4==0&&a%100!=0)||(a%400==0)){
			System.out.println(a+"������");
		}else{
			System.out.println(a+"��������");
		}
	}
}