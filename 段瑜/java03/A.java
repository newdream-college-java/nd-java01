import java.util.Scanner;
public class A{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("你爱我吗：");
		System.out.println("请输入yes或者no");
		String a=input.next();
		if(a.equals("yes")){	
			System.out.println("你是爱我的");
		}else if(a.equals("no")){
			System.out.println("原来你不爱我");
		}else{
			System.out.println("你到底是爱还是不爱，自己也不清楚");
		}
	
}
}