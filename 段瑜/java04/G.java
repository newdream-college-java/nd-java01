import java.util.Scanner;
public class G{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double sum=input.nextDouble();
		String a=input.next();
		double sum1=input.nextDouble();
		double b;
		if(a.equals("+")){
			b=sum+sum1;
			System.out.println(b);
		}else if(a.equals("-")){
			b=sum-sum1;
			System.out.println(b);
		}else if(a.equals("*")){
			b=sum*sum1;
			System.out.println(b);
		}else if(a.equals("/")){
			b=sum/sum1;
			System.out.println(b);
		}else{
			System.out.println(" ‰»Î¥ÌŒÛ£°");
		}
	}
}