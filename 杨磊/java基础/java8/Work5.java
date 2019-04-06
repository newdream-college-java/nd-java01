//¥Ú”°99≥À∑®±Ì
public class Work5{
	public static void main(String []args){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+(i*j)+" ");
				
			}
			System.out.println();
		}


		System.out.print("\n\n");
		for(int i=9;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+(i*j)+" ");
				
			}
			System.out.println();
		}

	}
}