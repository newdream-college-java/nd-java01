import java.util.Scanner;
public class H{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ������");
		int max=input.nextInt();
		int i=2;
		while(i<6){
			System.out.println("�������"+i+"������");
			int number=input.nextInt();
			if(max<number){
				max=number;
			}
			i++;
		}
			System.out.println("������������ֵΪ"+max);
			
	}		
}