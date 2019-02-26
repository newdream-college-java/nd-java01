//计算100以内的奇数之和


public  class F{
	public static void main(String[] arge){
		int sum = 0;
		for(int i = 1 ; i<100 ; i++){
		//方法一：sum+=i;
		//方法二：
		sum=sum+(i%2==0?0:i);
		}
		System.out.println(sum);
	}
}