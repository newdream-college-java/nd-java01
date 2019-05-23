public class Test10{
	public static void main(String [] args){
		int kg=0,xx=7;
		for(int i=1;i<5;i++){
			for(int j=1;j<=kg;j++){
				System.out.print(" ");
			}
			
			for(int a=1;a<=xx;a++){
				if(i==1||i==4){
					System.out.print("*");
				}else if(a==1||a==xx){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			kg++;
			xx-=2;
			System.out.println();
		}
	}
}