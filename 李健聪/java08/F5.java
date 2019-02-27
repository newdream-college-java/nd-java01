public class F5{
	public static void main(String[] args){
		int kg=3,colum=1;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=kg;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=colum;j++){
				if(i==1||i==4||i==7){
					System.out.print("*");
				}else{
					if(j==1||j==colum){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			if(i<4){
				kg--;
				colum+=2;
			}else{
				kg++;
				colum-=2;
			}System.out.println();
		}
	}
}