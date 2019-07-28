public class Zy1{
	public static void main(String[] args){
		int sum=0;
		for(int i=1;i<=100;i++){
			if((i%2)!=0){
			sum+=i;
			}
			/*sum=(i%2)!=0?sum+=i:sum;*/
		}
		System.out.print(sum);
	}
}