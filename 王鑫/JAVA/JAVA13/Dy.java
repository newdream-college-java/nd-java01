package Test2019_3_6_z13;

public class Dy {
	
	public void	printTriangle(int row,String ch){
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
