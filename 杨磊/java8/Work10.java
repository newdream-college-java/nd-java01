/*
*******
 *   *
  * *
   *
*/
public class Work10{
	public static void main(String []args){
		int c=7;
		for(int i=1;i<=4;i++){
			for(int j=1;j<i;j++){//打印空格
				System.out.print(" ");
			}
			for(int j=1;j<=c;j++){
				if(i==1||i==4){//正常的格子打印*
					System.out.print("*");
				}else{
					if(j==1||j==c){//不正常的格子第一个和最后一个打*中间打印“ ”
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				
			}
			System.out.println();
			c-=2;
		}
	}
}