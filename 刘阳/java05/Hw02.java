public class Hw02{
	public static void main(String[] args){
		System.out.print("1+1/4+1/9+....+1/£¨20*20£©");
		int i=1;
		double sum=0;
		while(i<=20){
			sum=sum+1.0/(i*i);
			i++;
		}
		System.out.print("ÖµµÈÓÚ£º"+sum);
	}
}