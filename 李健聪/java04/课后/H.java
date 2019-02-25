import java.util.Scanner;
public class H{
	public static void main(String[] args){
		Scanner dd = new Scanner(System.in); 
		System.out.print("请输入一个整数:   ");
		int sr=dd.nextInt();
		
		switch(sr){
			case 0:System.exit(-1);
			break;
			case 1:System.out.print("1:MON");
			break;
			case 2:System.out.print("2:TUE");
			break;
			case 3:System.out.print("3:WED");
			break;
			case 4:System.out.print("4:THU");
			break;
			case 5:System.out.print("5:FRI");
			break;
			case 6:System.out.print("6:SAT");
			break;
			case 7:System.out.print("7:SUN");
			break;
			default:
			System.out.print("输入错误请重新输入");
			String sc=dd.next();
			while(sc.equals("0")){
				System.exit(-1);
			}System.out.print("输入错误请重新输入");
			sc=dd.next();
		}
	}
}