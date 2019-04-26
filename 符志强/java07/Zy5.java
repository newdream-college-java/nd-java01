import java.util.Scanner;
public class Zy5{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("ÊäÈëÒ»¸ö×Ö·û´®");
		int n=input.nextInt();
		double sum=0;
		if(n>0){
			for(int i=1;i<=n;i++){
				sum=sum+1.0/i;
			}
			System.out.print(sum);
			
		}else{
			System.out.print("ÊäÈë´íÎó");
		}
	}
}