/*使用for循环与break的语句实现1：从1一直到100，但如果累加的和大于500也要结束循环，并输出此时已经加到的数是什么？*/
public class Test01{
	public static void main(String[] args){
	int sum=0;
	for(int i=1;;i++){
		sum+=i;
		if(sum>500){
			System.out.print("已经加到的数"+i+"\t和为："+sum);
			break;
		}
		}
	}
}