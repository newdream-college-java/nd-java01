import java.util.Scanner;
public class E{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("����������");
		int	sum=input.nextInt();
		int	sum1=input.nextInt();
		int	sum2=input.nextInt();
		if(sum==sum1&&sum1==sum2){
			System.out.println("�����������");
			if(sum+sum1+sum2>1000){
				System.out.println("��������֮�ʹ���1000");
				}
		}else if(sum+sum1+sum2>1000){
			System.out.println("��������֮�ʹ���1000");
		}else{
			System.out.println("��������֮�Ͳ�����1000");
			}
	}
}