//使用for循环与break语句实现：从1一直加到100，但如果累加的和大于500也要结束循环，并输出此时已经加到的数是什么？

public class Test01{
	public static void main(String[] arge){
		int sum = 0 , n=0 ;
		for(int i = 0 ; i< 100 ; i++){
			sum+=n=i;
			if(sum>500){
				break;
			}
		}
		System.out.println(n);
	}
}