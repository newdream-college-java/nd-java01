/*
*******

 *****

  ***

   *

*/
public class Test09{
	public static void main(String[] args){
		int kg=0;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=kg;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=9-2*i;j++){
				System.out.print("*");
			}
			kg++;
			System.out.println("\n");
		}
	}
}