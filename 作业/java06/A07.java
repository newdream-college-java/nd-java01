import java.util.Scanner;
public class java07{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("ѭ���������0����������0��������������");
		double sum =input.nextDouble();
		while(sum>0){
			System.out.println("������һ������");
			double b = input.nextDouble();
			if(b>0){
				sum+=b;
			}else{
				System.out.println(sum);
				break;
			}

		}
	}
}