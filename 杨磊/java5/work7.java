import java.util.*;
public class work7{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		for(;;){
			System.out.print("������0-7�����֣�");
			String a =input.next();
			if(!a.equals("0")){
				switch(a){
					case "1":
						System.out.println("MON");
						break;
					case "2":
						System.out.println("TUE");
						break;
					case "3":
						System.out.println("WED");
						break;
					case "4":
						System.out.println("THU");
						break;
					case "5":
						System.out.println("FRI");
						break;
					case "6":
						System.out.println("SAT");
						break;
					case "7":
						System.out.println("SUN");
						break;
					default:
						System.out.println("�������");
						break;

				}
				
			}else {
				System.out.print("�����ˣ�");
				break;
			}
		}
	}
}