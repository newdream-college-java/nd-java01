import java.util.Scanner;
public class Java05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������");
		int n = input.nextInt();
		double sum=0;
		if(n>0){
			for(int i=1;i<=n;i++){
				sum=sum+1.0/i;
			}
		}else{
			System.out.println("�������");
		}
		System.out.println(sum);
	}
}