import java.util.Scanner;
public class B{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String b="";
		
			for(int j=1;;j++){
				String a=input.next();
				if(a.equals("Esc")){
					System.out.println(b);
					System.exit(-1);
				}
				System.out.println("����"+a);
				System.out.println("����������");
				
				b+=a;
				continue;
				
			}
			
		
	}
}