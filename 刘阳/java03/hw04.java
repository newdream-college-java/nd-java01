import java.util.Scanner;
public class hw04{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("你爱我么？");
		String a= input.next();
		String b="yes",c="no";
		if(a.equals(b)){
			System.out.print("你是爱我的");
		}else if(a.equals(c)){
			System.out.print("原来你不爱我");
		}else{
			System.out.print("你到底是爱还是不爱，自己也不清楚");
		}
	}

}