import java.util.Scanner;
public class G{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ��������");
		int sum=input.nextInt();
		int b=0;
		while(sum!=0){
			b=b+sum;
			sum=input.nextInt();
		}
		System.out.println(b);
	}
}