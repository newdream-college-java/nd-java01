import java.util.Scanner;
public class Z5{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ������0��������");
		int n=input.nextInt();
		double sum=0.0;
		while(n<=0){
			System.out.print("����������������");
			n=input.nextInt();
		}
		for(int i=1;i<=n;i++){
	
				sum=sum+1.0/i;
		
		
		}
		System.out.print(sum);
	}
}