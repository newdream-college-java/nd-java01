public class E{
	public static void main(String[] args){
		int i=100;
		while(i<1000){
			if(i==Math.pow(i%100/10,3)+Math.pow(i/10%10,3)+Math.pow(i%10,3)){
				System.out.println(i);
			}
			i++;	
			
		}
	}
}