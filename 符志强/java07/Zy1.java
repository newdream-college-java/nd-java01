import java.util.Scanner;
public class Zy1{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������1-10֮�������");
		int a=input.nextInt();
		int sum=1;
		if(a<1||a>10){
		System.out.println("���������");
		}
		else{	System.out.print(a+"!=");	
			for(int i=a;i>=1;i--){
				
				
				sum=sum*i;	
				System.out.print(i);
				if(i!=1){
				System.out.print("*");
				continue;
				}	
			}
			System.out.print("="+sum);
		}
		
	}
}