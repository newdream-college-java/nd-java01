public class Java04{
	public static void main(String[] args){
		int sum=0;
		for(int i=1;i<=10;i++){
			int m=1;
			for(int j=1;j<=i;j++){
				m=m*j;
				
			}
			sum=sum+m;
		}
		System.out.println(sum);
	}
}
