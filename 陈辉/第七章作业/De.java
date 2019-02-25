import java.util.Scanner;
public class De{
	public static void main (String[]args){
		Scanner input=new Scanner(System.in);
		int a = input.nextInt();
		int s=0,d=0,b=0;
		for(; ;){
			if(a>0){
				s=s+1;
				if(a==999){
					break;
				}			
			}else if(a==0){
				d=d+1;
			}else{
				b=b+1;
			}a=input.nextInt();

		}	System.out.println("分别输出正整数"+s+"0"+d+"负数"+b);
	}
}