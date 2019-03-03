public class java04{
	public static void main(String[] args){
		int i=10000;
		int b;
		int numf=0;
		while(i<=99999){
			if((i%10==i/10000)&&(i/10%10==i/1000%10)){
				System.out.println(i);
			}
		i++;
		}
	}
}