public class Java06_2{
	public static void main(String[] args){
		for(int i=1;i<=4;i++){
			for(int kg=1;kg<i;kg++){
				System.out.print(" ");
			}
			for(int j=1;j<=10;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}