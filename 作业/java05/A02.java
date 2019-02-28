/**
**º∆À„1+1/4+1/9+......+1/(20*20)
**/
public class Test02{
	public static void main(String[] args){
		int i=1;
		double sum=0;
		while(i<=20){
			sum=sum+1.0/(i*i);
			i++;
		}
		System.out.println("1+1/4+1/9+......+1/(20*20)="+sum);
	}
}