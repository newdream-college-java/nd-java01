/*Êä³öÍ¼ÐÎ 
   *
  * *
 *   *
*******
 *   *
  * *
   *


*/
public class Hw0606{
	public static void main(String[] args){
		int kg=3,colum=1;
		for(int i=1;i<=7;i++){
			for(int j=0;j<kg;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=colum;k++){
				if(i==1||i==4||i==7){
					System.out.print("*");
				}else{
					if(k==1||k==colum){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}	
			}
			System.out.println("\n");
			if(i>=4){
				colum-=2;
				kg++;
			}else{
				colum+=2;
				kg--;
			}
		}
	}
}