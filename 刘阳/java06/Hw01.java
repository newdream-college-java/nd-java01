/*计算100以内的奇数之和*/
public class Hw01{
	public static void main(String[] args){
		int sum=0;
		int i=1;
		for(;i<100;i+=2){
			sum+=i;
		}
		System.out.print("100以内的奇数之和为："+sum);	
	}
}