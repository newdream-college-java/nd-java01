/*
   *
  * *
 *   *
*******
 *   *
  * *
   *
*/
public class Work11{
	public static void main(String []args){
		int c=1;
		int x=4;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=x;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=c;j++){
				if(i==1||i==4||i==7){
					System.out.print("*");
				}else{
					if(j==1||j==c){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				
			}
			System.out.println();
			if(i<4){
				x--;
				c+=2;
			}else{
				x++;
				c-=2;
			}
		}
	}
}