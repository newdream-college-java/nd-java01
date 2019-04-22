import java.util.Scanner;


public class Testwxws {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Denrucaidan gu=new Denrucaidan();
		gu.showLoginMenu();
		int a=input.nextInt();
		if(a==1){
			gu.showMainMenu();
			int b=input.nextInt();
			if(b==1){
				gu.showCustMenu();
				int c=input.nextInt();
				if(c==0){
					gu.showMainMenu();
				}
			}else if(b==2){
				gu.showSendGMenu();
				int d=input.nextInt();
				if(d==0){
					gu.showMainMenu();
				}
			}else{
				gu.showLoginMenu();
			}
		}else{
			System.out.print("ÒÑÍË³ö");
		}
	}

}
