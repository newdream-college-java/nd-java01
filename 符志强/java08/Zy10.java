public class Zy10{
	public static void main(String[] args){
		int xx=1;
		int lie=1;
		for(int i=1;i<=4;i++){
			if(i>1){	
				for(int k=1;k<=i-1;k++){
					System.out.print(" ");
				}
			}
			for(int j=7;j>=xx;j--){
				if(xx==7||xx==1){//第一行和最后一行
					System.out.print("*");
				}else{
					if(j==7||j==xx){//第一列和最后一列
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			xx+=2;
			System.out.println();
		}
	}

}