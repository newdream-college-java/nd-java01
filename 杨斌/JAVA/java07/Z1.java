import java.util.Scanner;
public class Z1{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ��������");
		int a=input.nextInt();
		int sum=1;
		System.out.print(a+"!=");
		for(int i=a;i>0;i--){
			if(1>=a&&a>=10){
				
				System.out.print("��������룬��������");
				a=input.nextInt();
				
			}else{				
				sum*=i;
				//System.out.print(a+"!=");
				System.out.print(i);
				if(i==1){
				continue;
				}
				System.out.print("*");
				
			}
		}
		System.out.print("="+sum);
	
	}
}