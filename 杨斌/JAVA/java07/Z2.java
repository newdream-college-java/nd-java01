import java.util.Scanner;
public class Z2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("ÇëËæ»úÊäÈë×Ö·û´®");
		String a=input.next();
		String b=a;
		for(int i=1;i>=1;i++){
			System.out.print("ÇëËæ»úÊäÈë×Ö·û´®");
			a=input.next();
			if(a.equals("Esc")){	
				break;
			}
			b=b+a;
		}
		System.out.print(b);
		
	}
}