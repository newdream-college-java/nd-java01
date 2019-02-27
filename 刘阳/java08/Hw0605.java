/*Êä³öÍ¼ÐÎ 
*******
 *   *
  * *
   *


*/
public class Hw0605{
	public static void main(String[] args){
		int kg=0;
		int colum=7;
		for(int i=4;i>=1;i--){
			for(int j=1;j<=kg;j++){
				System.out.print(" ");
			}
		
			for(int j=1;j<=colum;j++){
				if(i==1||i==4){
					System.out.print("*");
				}else{
					if(j==1||j==colum){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.println("\n");
			kg++;
			colum-=2;
		}
	}
}