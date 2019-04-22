/*求和：1！+2！+3！+4！+......+10！*/
public class Test04{
	public static void main(String[] args){
	int sum=0; 
	int i,j;
	for(i=1;i<=10;i++){
		int product=1;
		for(j=1;j<=i;j++){
			product*=j;
		}
		sum+=product;
	}
	System.out.print("和为："+sum);
	}
}