public class D{
	public static void main(String[] args){
		 int sum1=0;
		for(int i=1;i<=10;i++){
			int sum=1;
			for(int j=1;j<=i;j++){
			sum*=j;
			
			}sum1+=sum;
			
		}System.out.print(sum1);
	}
}