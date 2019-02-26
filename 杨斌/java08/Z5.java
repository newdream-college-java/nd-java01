public class Z5{
	public static void main(String[] args){
		for(int i=9;i>=1;i--){
			for(int j=9;j>=1;j--){
				if(i>=j){
					System.out.print(j+"*"+i+"="+i*j+"\t");
				}else{
					System.out.print("\t");
				}
				if(j==1){
					System.out.print("\n");
				}
				
			}	
		}
		
	}
}