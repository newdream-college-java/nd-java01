/*
*******
 *****
  ***
   *
*/
public class Work9{
	public static void main(String []args){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=7;j>=2*i-1;j--){
				System.out.print("*");				
			}
			System.out.println();
		}
	}
}