public class D{
	public static void main(String[] args){
		int i=10000;
		while(i<100000){
			
			if(i/10000==i%10&&i/1000%10==i/10%10){
				System.out.println(i);
			}
			i++;
		}
	}
}