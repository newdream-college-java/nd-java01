import java.util.Scanner;

public class G{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		System.out.print("�����룺");
		int n = input.nextInt();
		while(n>0&&n<8){
			if(n==1){							
				System.out.print("MON\n���ٴ����룺");
			}else if(n==2){							
				System.out.print("TUE\n���ٴ����룺");
			}else if(n==3){								
				System.out.print("WED\n���ٴ����룺");
			}else if(n==4){
				System.out.print("THU\n���ٴ����룺");
			}else if(n==5){							
				System.out.print("FRI\n���ٴ����룺");
			}else if(n==6){	
				System.out.print("SAT\n���ٴ����룺");
			}else{
				System.out.print("SUN\n���ٴ����룺");
			}
			n = input.nextInt();
		}
		System.out.print("�������");
	}
}