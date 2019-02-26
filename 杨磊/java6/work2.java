public class work2{
	public static void main(String []args){
		for(int i = 1;i<=100;i++){
			if(i%3==0&&i%5==0){
				System.out.print("FilpFlop\t");
			}else if(i%3==0){
				System.out.print("Filp\t");
			}else if(i%5==0){
				System.out.print("Flop\t");
			}else{
				System.out.print(i +"\t");				
			}
		}
	}
}