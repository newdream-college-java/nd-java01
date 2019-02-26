import java.util.*;
public class work2{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
			String sum="";
		for(;;){
			System.out.print("ÇëÊäÈë×Ö·û´®£¡");
			String a = input.next();
			if(!a.equals("Esc")){
				sum+=a;
			}else{
				break;
			}
		}
		System.out.print(sum);
		
	}
}