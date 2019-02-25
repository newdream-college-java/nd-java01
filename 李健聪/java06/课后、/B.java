//开发标题为FlipFlop的游戏应用程序
import java.util.Scanner;
public class B{
	public static void main(String[] args){
		for(int i=1;i<101;i++){
			if(i%3==0){
				System.out.println("Flip");
				
			}if(i%5==0){
				System.out.println("Flop");
				
			}else{
				System.out.println(i);
				
			}
		}
	}
}