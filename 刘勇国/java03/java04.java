import java.util.Scanner;
public class java04{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("你爱我吗？(yes/no)");
	String answer = input.next();
	if(answer.equals("yes")){
		System.out.println("你是爱我的");
	}
	else if(answer.equals("no")){
		System.out.println("你不爱我");
	}else{
		System.out.println("你到底是爱我还是不爱我");
	}
	}
}