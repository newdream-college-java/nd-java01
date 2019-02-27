public class Zy9{
	public static void main(String[] args){
		int xx=7;
		for(int i=1;i<=4;i++){
			if(i>1){
				for(int k=1;k<=i-1;k++){
					System.out.print(" ");
				}
			}
			for(int j=1;j<=xx;j++){
				System.out.print("*");
			}
			xx=xx-2;
			System.out.println();
		}
	}
}