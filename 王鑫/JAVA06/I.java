//输出10000-99999里面的所有回文数，说明：例如：12321是回文数。个位与万位之间相同，个位与十位相同。12321 23332 15951

public class I{
	public static void main(String[] arge){
		for(int i = 0;i <99999;i++){
			if(i/10000==i%10&&i/1000%10==i/10%10){
				System.out.println(i);
			}

		}
	}
}