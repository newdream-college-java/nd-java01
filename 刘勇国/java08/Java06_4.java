public class Java06_4{
	public static void main(String[] args){
		int x=7;
		for(int i=1;i<=4;i++){
			for(int kg=1;kg<i;kg++){
				System.out.print(" ");
			}
			for(int xx=1;xx<=x;xx++){
				System.out.print("*");
			}
			x=x-2;
			System.out.print("\n");
		}
	
	}
}