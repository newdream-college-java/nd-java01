/**
	 *******   0���ո� 7��*
	   *****    1���ո� 5��*
	    ***      2���ո� 3��*
	     *        3���ո� 1��*
**/

public class Test09{
	public static void main(String[] args){
		int kg=0;
		for(int i=4;i>=1;i--){
			//���ÿһ�еĿո�
			for(int j=0;j<kg;j++){
				System.out.print(" ");
			}
			//���ÿһ�е�*
			for(int k=1;k<=(2*i-1);k++){
				System.out.print("*");
			}
			//����
			System.out.println();
			kg++;
		}
	}
}