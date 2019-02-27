public class Test9{
	public static void main(String [] args){
		int kg=0,xx=7;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=kg;j++){
				System.out.print(" ");
			}
			for(int a=1;a<=xx;a++){
				System.out.print("*");
			}
			kg++;
			xx-=2;
			System.out.println();
		}
	}
}