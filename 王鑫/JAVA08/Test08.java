/*

****
***
**
*

*/


public class Test08{
	public static void main(String[] arge){
		for(int i = 4 ; i>0 ; i--){
			for(int j = 4-i ; j>0 ; j--){
				System.out.print(" ");
			}
			for(int j = 1; j<i*2;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}