import java.util.Scanner;
public class Hw05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//��ʾ��
		int i =1,n;
		double sum=0;
		System.out.print("������һ��������");
		n=input.nextInt();
		do{	
			if(n>0){
				sum=sum+1.0/i;
			}else{
				System.out.print("�������");
				System.exit(-1);
			}
			i++;
		}while(i<=n);
		System.out.print("1+1/2+1/3+....+1/n="+sum);
	}
}