import java.util.Scanner;
public class Ss{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入猴子买的桃数");
		int score = input.nextInt();
		if(score<3){
			System.out.println(score);

		}else if(score>=3&&score<6){
			System.out.println(score+1);

		}else if(score>5){
			System.out.println(score+2);

	}
						
			
	}

}