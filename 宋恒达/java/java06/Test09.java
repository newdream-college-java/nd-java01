/**
**�̳��Թ˿͵������ν��е��飬����������εĹ˿ͱ���
**/
import java.util.Scanner;
public class Test09{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=-1;
		int sum1=0;
		int sum2=0;
		for(int i=1;i<=10;i++){
			System.out.print("�������"+i+"λ�˿͵�����:");
			a=input.nextInt();
			if(a<=30){
				sum1++;
			}else{
				sum2++;
			}
		}
		System.out.println("30�����µı�����"+(sum1*1.0)/10*100+"%");
		System.out.println("30�����ϵı�����"+(sum2*1.0)/10*100+"%");
	}
}