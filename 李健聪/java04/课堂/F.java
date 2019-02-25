import java.util.Scanner;
public class F{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("你爱不爱我？");
		String answer=input.next();
		while(!answer.equals("爱")){
			System.out.println("你爱不爱我？");
			answer=input.next();	
		}
			System.out.println("你是爱我的");
	}
}