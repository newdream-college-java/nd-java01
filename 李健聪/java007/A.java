import java.util.Scanner;
public class A{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ�����Ľ׳�");
		int sum=1;
		int a=input.nextInt();
		for(int i=1;i<=a;i++){
				
				if(!(a>=1&&a<=10)){
					System.out.print("a����������");
					break;
					
				}else{
					sum*=i;
				}	System.out.println(a+"�Ľ׳�Ϊ"+sum);
				
					
		}
	}
}