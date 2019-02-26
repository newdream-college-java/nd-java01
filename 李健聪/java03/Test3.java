import java.util.Scanner;
public class Test3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入杨斌的性别");
		//123123
		String yb = input.next();
		if(yb.equals("男")){
			System.out.println("杨斌是爷们");
		}	
		if(!yb.equals("男")){
			System.out.println("杨斌是娘们");
		}	

	}



}
/*
import java.util.Scanner;
public class 类名{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("");
		int a = input.nextInt();
		
	}
}
*/