//ÇóºÍ1£¡+2£¡+...+10£¡


public class Test04{
	public static void main(String[] arge){
		int sum = 0;
		for(int i = 1; i<=10; i++){
			int n = 1;
			for(int j =1; j<=i ; j++){
				n*=j;
			}
			sum+=n;
		}
		System.out.print(sum);
	}
}