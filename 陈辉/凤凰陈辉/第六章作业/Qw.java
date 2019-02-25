//import java.util.Scanner;
public class Qw{
	public static void main (String[]args){
		//Scanner input = new Scanner(System.in);
		System.out.println("");	
		int i = 1;
		while(i<101){
			
				
		if(i%3==0&&i%5==0){
			
			System.out.println("FlipFlop");
			
		}else if(i%5==0){
			
			System.out.println("Flop");
			
		}else if(i%3==0){
		
			System.out.println("Flip");
		}else{
			System.out.println(i);
		}	
			i++;
				
		}
	}

}