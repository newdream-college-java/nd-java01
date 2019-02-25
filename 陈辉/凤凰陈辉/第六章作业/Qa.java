//import java.util.Scanner;//导包
public class Qa{
	public static void main(String[]args){
		//Scanner input = new Scanner(System.in);//把导入的包放入input
		//System.out.println("1900-2012的闰年");
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