import java.util.Scanner;
public class Test6{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ��������");
		int n=input.nextInt();
		double a=0;
		for(int i=1;i<=n;i++){
			a=a+1.0/i;
		}
		if(n<0){
			System.out.println("�������");
		}else{
			System.out.println(a);
		}
	}	
}