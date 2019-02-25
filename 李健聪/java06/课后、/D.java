//求回文数
public class D{
	public static void main(String[] args){
		for(int i=10000;i<100000;i++){
			if((i/10000)%10==i%10&&((i/1000)%10)==(i/10)%10){
				System.out.println(i);
			}
		}
	}
}