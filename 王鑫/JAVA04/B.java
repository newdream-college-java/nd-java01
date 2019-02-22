//º∆À„1+1/4+1/9+....+1/(20*20)

public class B{
	public static void main(String[] arge){
		int i=1;
		double sum = 0;
		while(i<=20){
			sum+=1.0/(i*i);
			i++;
		}
		System.out.println("1+1/4+1/9+....+1/(20*20)="+sum);
	}
}