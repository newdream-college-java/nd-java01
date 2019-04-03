/**
		*******    0个空格 
		  *    *      1个空格
		   *  *	2个空格
		     *	3个空格
**/

public class Test10{
	public static void main(String[] args){
		int kg=0;
		int colum=7;
		for(int i=4;i>=1;i--){
			for(int j=0;j<kg;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=colum;k++){
				if(i==1||i==4){
					System.out.print("*");
				}else{
					if(k==1||k==colum){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}				
			}
			System.out.println();
			kg++;
			colum-=2;
		}
	}
}