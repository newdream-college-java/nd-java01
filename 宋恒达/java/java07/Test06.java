/**
**����һ������n��ͳ��1��n���ж��ٸ�������ż��
**/
import java.util.Scanner;
public class Test06{
	public static  void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������һ������:");
		int a=input.nextInt();
		int sum1=0;
		int sum2=0;
		for(int i=1;i<=a;i++){
			if(i%2==0){
				sum1++;
			}else{
				sum2++;
			}
		}
		System.out.println("1��n��"+sum1+"��ż������ "+sum2+"������");
	}
}