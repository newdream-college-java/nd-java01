public class Hw02{
	public static void main(String[] args){
		System.out.println("FlipFlop��Ϸ��������");
		int i=1;
		
		do{
			if((i%3==0)&&(i%5==0)){
				System.out.println("FlipFlop");
			}else if(i%3==0){
				System.out.println("Flip");
			}else if(i%5==0){
				System.out.println("Flop");
			}else{
			System.out.println(i);
			}
			i++;
		}while(i<=100);
	
	}
}