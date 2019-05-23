import java.util.Scanner;
public class Test3{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String a=input.next();
		String b=a;
		for(int i=1;i!=0;i++){
			if(a.equals("Esc")){
				break;
			}
			a=input.next();
			b=b+a;
		}
		System.out.println(b);
	}
}