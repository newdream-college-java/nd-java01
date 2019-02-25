public class Zy2{
	public static void main(String[] args){
		for(int i=1;i<=100;i++){
			if(i%3==0&&i%5==0){
				System.out.println("FlipFlop");		
			}else if(i%5==0){
				System.out.println("Flop");		
			}else if(i%3==0){
				System.out.println("Flip");
			}else{
				System.out.println(i);
			}
		}
	}

}