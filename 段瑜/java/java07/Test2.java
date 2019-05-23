import java.util.Scanner;
public class Test2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum=input.nextInt();
		int a=1;
		System.out.print(sum+"!=");
		if(sum>=1&&sum<=10){
			for(int i=sum;i>=1;i--){
				a=a*i;
				System.out.print(i);
				if(i!=1){
				System.out.print("*");
				}
			}
		}else{
			System.out.println("ÊäÈë´íÎó£¡");
		}
		System.out.println("="+a);
		
	}
}