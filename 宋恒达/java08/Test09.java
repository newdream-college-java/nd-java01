/**
	 *******   0个空格 7个*
	   *****    1个空格 5个*
	    ***      2个空格 3个*
	     *        3个空格 1个*
**/

public class Test09{
	public static void main(String[] args){
		int kg=0;
		for(int i=4;i>=1;i--){
			//输出每一行的空格
			for(int j=0;j<kg;j++){
				System.out.print(" ");
			}
			//输出每一行的*
			for(int k=1;k<=(2*i-1);k++){
				System.out.print("*");
			}
			//换行
			System.out.println();
			kg++;
		}
	}
}