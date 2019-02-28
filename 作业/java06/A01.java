/*计算100以内的奇数之和*/
public class A01{
	public static void main(String[] args){
		//第一步计算奇数
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%2!=0){
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("和为："+sum);
	}
		
}