/*计算输出100+101+102+.......+200之和*/
public class Hw01{
	public static void main(String[] args){
		int sum=0;
		int i=100;
		while(i<=200){
			sum+=i;
			i++;
		}
		System.out.print("和为："+sum);
	}
}