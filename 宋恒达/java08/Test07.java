/**
		**************       0个空格
		  **************     1个空格
		    **************   2个空格
		      ************** 3个空格
**/

public class Test07{
	public static void main(String[] args){
		int kg=0;//空格变化
		for(int i=1;i<=4;i++){
			//输出每一行的空格
			for(int j=0;j<kg;j++){
				System.out.print(" ");
			}
			//每一行的*
			for(int k=1;k<=14;k++){
				System.out.print("*");
			}
			//换行
			System.out.println();
			kg++;
		}
	}
}
