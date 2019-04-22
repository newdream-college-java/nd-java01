/*Êä³öÍ¼ÐÎ 

*******
 *****
  ***
   *


*/
public class Hw0604{
	public static void main(String[] args){
		for(int i=4;i>=1;i--){
			for(int j=1;j<=(2*i-1);j++){
				System.out.print("*");
			}
			System.out.print("\n\n");
			for(int k=0;k<=(4-i);k++){
				System.out.print(" ");
			}
		}
	}
}