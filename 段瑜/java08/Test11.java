public class Test11{
	public static void main(String[] args){
		int kg=3,xx=1;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=kg;j++){
				System.out.print(" ");
			}
			for(int a=1;a<=xx;a++){
				if(i==1||i==4||i==7){
					System.out.print("*");
				}else if(a==1||a==xx){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			if(i<=3){
				kg--;
				xx=xx+2;
			}else{
				kg++;
				xx=xx-2;
			}
			System.out.println();
			
		}
	}
}