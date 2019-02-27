/*计算1一直加到100，什么时候累加的和大于了500，结束循环然后输出此时加到了什么数*/
public class Hw01{
	public static void main(String[] args){
		int sum=0;
		int i=1;
		for(;i<100;i++){
			sum=sum+i;
			if(sum>500){
				System.out.print("此时加到的数是："+i);
				break;
			}
		}
	}
}