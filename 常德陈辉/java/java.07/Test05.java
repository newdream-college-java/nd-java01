/*����һ������n,���n����0������ͣ�1+1/2+1/3+...+1/n������������������*/
import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("������һ������");
	double n=input.nextDouble();
	double sum=0;
	if(n>0){
		for(int i=1;i<=n;i++){
			sum+=1.0/i;
			}
			System.out.print("��Ϊ��"+sum);
		}else{
			System.out.print("�������");
		}
	}

}