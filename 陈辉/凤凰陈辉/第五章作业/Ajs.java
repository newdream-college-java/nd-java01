import java.util.Scanner;
public class Ajs{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("������7����");
		int a =input.nextInt();
		while(a>=1&&a<8){
			if(a==1){
				System.out.println("MON"+"\n���ٴ�����");
				a =input.nextInt();
				
			}if(a==2){
				System.out.println("TUE"+"\n���ٴ�����");
				a =input.nextInt();
				
			}if(a==3){
				System.out.println("WED"+"\n���ٴ�����");
				a =input.nextInt();
				
			}if(a==4){
				System.out.println("THU"+"\n���ٴ�����");
				a =input.nextInt();
				
			}if(a==5){
				System.out.println("FRI"+"\n���ٴ�����");
				a =input.nextInt();
				
			}if(a==6){
				System.out.println("SAT"+"\n���ٴ�����");
				a =input.nextInt();
				
			}if(a==7){
				System.out.println("SUN"+"\n���ٴ�����");
				a =input.nextInt();
				
			}		
		}


	}

}