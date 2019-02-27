public class Z5{
	public static void main(String[] args){
		for(int i=9;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+i*j+"\t");				
				if(j==i){
					System.out.print("\n");
				}
				
			}	
		}
		
	}
}