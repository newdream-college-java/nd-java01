import java.util.Scanner;
public class G{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i=1;
		while(i!=0){
			System.out.println("请输入一个数");
			int a=input.nextInt();
			i++;
			switch(a){
				case 1:
					System.out.println(a+":MON");
					break;
				case 2:
					System.out.println(a+":TUE");
					break;
				case 3:
					System.out.println(a+":WED");
					break;
				case 4:
					System.out.println(a+":THU");
					break;
				case 5:
					System.out.println(a+":FRI");
					break;
				case 6:
					System.out.println(a+":SAT");
					break;
				case 7:
					System.out.println(a+":SUN");
					break;
				case 0:
					i=0;
					break;
				default:
					System.out.println("输入错误请重新输入！");
					break;
			}
		}
	}
}