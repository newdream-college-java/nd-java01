//import java.util.Scanner;//����
public class Qa{
	public static void main(String[]args){
		//Scanner input = new Scanner(System.in);//�ѵ���İ�����input
		//System.out.println("1900-2012������");
		//int a = input.nextInt();
		int i=1900;
		while(i<2013){
			
			if(i%4==0&&i%100!=0||i%400==0){
				i++;
				System.out.println(i);
			}		
		}
		
	}


}