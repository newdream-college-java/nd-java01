public class Zy4{
	public static void main(String[] args){
		for(int i=10000;i<=99999;i++){
			if(i/10000%10==i%10&&i/1000%10==i/10%10){
				System.out.println(i);
			}
		}

	}

}