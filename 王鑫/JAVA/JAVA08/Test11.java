/*
   *
  * *
 *   *
*******
 *   *
  * *
   *
�ܽ᣺1.�˽��ҵ�ȫ�������м�û�пո���У����ǰ�ſո�������������м�ո񣬸��ݹ��ɽ������
*/


public class Test11{
	public static void main(String[] arge){
		int kg = 4;
		int colum = 1 ;
		for(int i = 1 ; i<= 9 ; i++){
			for(int j = 1; j<= kg;j++){
				System.out.print(" ");
			}
			for(int j = 1 ; j <= colum ; j++){
				if(i==1||i==5||i==9){
					System.out.print("*");
				}else{
					if(j==1||j==colum){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
			if(i>=5){
				kg++;
				colum-=2;
			}else{
				kg--;
				colum+=2;
			}
		}
	}
}