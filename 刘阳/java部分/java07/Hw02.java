import java.util.Scanner;
public class Hw02{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//ÇëÊäÈë×Ö·û´®
		System.out.println("ÇëÊäÈë×Ö·û´®£º");
		StringBuffer buffer = new StringBuffer();
		String a;
		while (true) {
			a = scanner.nextLine();
			if ("Esc".equals(a)) {
			break;
		}
		buffer.append(a);
		}
		System.out.println("ÄúÊäÈëµÄ×Ö·ûÎª: " + buffer.toString());
	} 
}