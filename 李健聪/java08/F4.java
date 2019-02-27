public class F4{
	public static void main(String[] args){
		int kg=0,colum=7;
		for(int i=1;i<=4;i++){
			for(int j=0;j<kg;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=colum;j++){
				if(i==1||i==5){
					System.out.print("*");
				}else{
					if(j==1||j==colum){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			kg++;
			colum-=2;
			System.out.println();
			
		}
	}
}