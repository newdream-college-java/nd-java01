/**
		**************       0���ո�
		  **************     1���ո�
		    **************   2���ո�
		      ************** 3���ո�
**/

public class Test07{
	public static void main(String[] args){
		int kg=0;//�ո�仯
		for(int i=1;i<=4;i++){
			//���ÿһ�еĿո�
			for(int j=0;j<kg;j++){
				System.out.print(" ");
			}
			//ÿһ�е�*
			for(int k=1;k<=14;k++){
				System.out.print("*");
			}
			//����
			System.out.println();
			kg++;
		}
	}
}
