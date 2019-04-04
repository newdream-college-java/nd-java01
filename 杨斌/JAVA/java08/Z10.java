public class Z10{
	public static void main(String[] args){
		int kg=1,xx=7;
		for(int i=1;i<=4;i++){
			for(int j=1;j<kg;j++){			
				System.out.print(" ");
			
			}
			for(int j=1;j<=xx;j++){	
				if(i==1||i==4){		
					System.out.print("*");
				}else{
					if(j==1||j==xx){
						System.out.print("*");	
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.print("\n");
			kg++;
			xx-=2;	
			
				
		}
		
	}
}