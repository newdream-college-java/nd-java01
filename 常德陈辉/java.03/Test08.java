/*��������int�͵����ݣ����뵽a��b��c����������ȥ��ʹ�������ṹ�뽻���߼���������������С�������С�*/
import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("��������������");
	int a=input.nextInt();
	int b=input.nextInt();
	int c=input.nextInt();
	if(a<b&&a<c){
		if(b<c){
			System.out.print(a+"<"+b+"<"+c);
			}else{
			System.out.print(a+"<"+c+"<"+b);
			}
		}else if(b<a&&b<c){
		if(a<c){
			System.out.print(b+"<"+a+"<"+c);
			}else{
			System.out.print(b+"<"+c+"<"+a);
			}
		}else if(c<a&&c<b){
		if(a<b){
			System.out.print(c+"<"+a+"<"+b);
			}else{
			System.out.print(c+"<"+b+"<"+a);
			}	
		}
	}

}