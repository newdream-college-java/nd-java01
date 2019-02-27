public class F3{
	public static void main(String[] args){
		int a=7;
		int kg=0;
		for(int i=1;i<=4;i++){
			for(int j=0;j<kg;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=a;j++){
				System.out.print("*");
			}
			a-=2;
			kg++;
			System.out.println();
		}
	}
}