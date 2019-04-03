/**
**输出10000-99999里面的所有回文数。说明：例如：12321是回文数，个位
**与万位相同，个位与千位相同。12321 99999 99899
**/
public class Test04{
	public static void main(String[] args){
		int i=10000;
		while(i<=99999){
			if((i%10==i/10000)&&(i/10%10==i/1000%10)){
				System.out.println(i+"是回文数");
			}
			i++;
		}
	}
}