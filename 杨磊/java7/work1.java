import java.util.*;
public class Work1{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
			for(;;){
				System.out.print("������һ��1-10����������");
				int a = input.nextInt();
				int sum = 1;
				if(a>=1&&a<=10){
				System.out.print(a+"!=");
					for(int j = 1;j<=a ;j++){
						sum*=j;
						System.out.print(j+"*");
					}
					System.out.println("\b="+sum+"\n");
				}else{
					System.out.print("�������");
					break;
				}
			}
		
	}
}