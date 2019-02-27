/**
**ÇóºÍ1!+2!+3!+4!+......+10!
**/

public class Test04{
	public static void main(String[] args){
		int sum=0;
		for(int i=1;i<=10;i++){
			int sum1=1;
			for(int j=1;j<=i;j++){
				sum1*=j;
			}
			sum+=sum1;
		}
		System.out.println("1!+2!+3!+4!+......+10!="+sum);
	}
}