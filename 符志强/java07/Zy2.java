import java.util.Scanner;
public class Zy2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("ÊäÈëÒ»¸ö×Ö·û´®");
		String a=input.next();
		String b="";
		while(!a.equals("esc")){
			
			b=b+a;
			a=input.next();
		}
		System.out.print(b);
	}
}