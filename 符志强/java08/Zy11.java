public class Zy11{
	public static void main(String[] args){
		int xx=1;
		
		for(int i=1;i<=7;i++){
			for(int k=3;k>=i;k--){
				System.out.print(" ");
			}
			if(i>4){
				for(int k=5;k<=i;k++){
					System.out.print(" ");
				}
				
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
			
			System.out.println();
			if(i<4){
				xx+=2;	
			}else{
				xx-=2;
			}
		}	
	}
}