//�������1��1�յ������������
//���� 31�� 1 3 5 7 8 10 12	
//С��30  4 6 9 11
//ƽ  28  ����29											//������forѭ��
import java.util.Scanner;
public class F{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("���������");
		int year=input.nextInt();
		System.out.print("�����������ٺ�");
		int day=input.nextInt();
		int i=1,sum=0;
		while(i<2){
			if(i==1){
				sum+=31;		
				
			}
			if(i==2){
			if(year%4==0&&year%100!=0||year%400==0){
				sum+=29;
				
			}else{
				sum+=28;
				
			
			}
					
			}
		
			i++;	
		
		}
			
			System.out.print("һ��"+(sum+day)+"��");	
}
}