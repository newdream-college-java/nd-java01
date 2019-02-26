/**
**计算100以内的奇数之和
**/
public class Test01{
	public static void main(String[] args){
		int i=1;
		int sum=0;
		while(i<=100){
			sum+=i;
			i=i+2;
		}
		System.out.println("100以内的奇数之和为"+sum);
	}
}