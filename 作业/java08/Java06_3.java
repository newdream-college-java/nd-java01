public class Java06_3{
	public static void main(String[] args){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}