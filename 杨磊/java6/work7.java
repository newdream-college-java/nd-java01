import java.util.*;
public class work7{
	public static void main(String []args){
		Scanner input =new Scanner(System.in);
		int sum=0;
		for(;;){
			System.out.print("ÇëÊäÈëÊı×Ö:");
			int a= input.nextInt();
			if(a>0){
				sum +=a;		
			}else{
				break;
			}
			
		}
		System.out.print(sum);
	}
}