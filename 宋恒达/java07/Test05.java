/**
**����һ������n�����n����0������ͣ�1+1/2+1/3+...+1/n,����������������
**/
import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=-1;
		double sum=0;
		System.out.print("������һ������0������:");
		if(input.hasNextInt()){
			a=input.nextInt();
			if(a>0){
				for(int i=1;i<a;i++){
					sum+=(1.0/i);
				}
			}else{
				System.out.println("�������");
				System.exit(-1);
			}
		}else{
			System.out.println("�������");
			System.exit(-1);
		}
		System.out.println("1+1/2+1/3+...+1/n="+sum);
	}
}