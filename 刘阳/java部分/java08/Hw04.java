/*求和1！+2！+......+10！*/
public class Hw04{
	public static void main(String[] args){
		int sum=0,cum=1;
		for(int i=1;i<=10;i++){
			cum=cum*i;
			sum+=cum;
		}
		System.out.print("求和1！+2！+......+10！等于："+sum);
	}
}