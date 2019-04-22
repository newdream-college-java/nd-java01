/*
*******

 *   *

  * *

   *

*/
public class Test10{
	public static void main(String[] args){
		int kg=0;
		int a=7;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=kg;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=9-i*2;j++){
				if(i==1||i==4){
					System.out.print("*");
				}else{
					if(j==1||j==a){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			kg++;
			a-=2;
			System.out.println("\n");
		}
	}
}