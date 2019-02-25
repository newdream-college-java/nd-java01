/*输出10000-99999里面的所有回文数。说明：列如12321是回文数，个位与万位相同，十位与千位相同。12321 99999 99899*/
public class Test04{
	public static void main(String[] args){
	int a,b,c,d,i;
	for(i=10000;i<100000;i++){
		a=i/10000%10;
		b=i/1000%10;
		c=i/10%10;
		d=i%10;
		if(a==d&&b==c){
			System.out.println("回文数："+i);
			}
		}
	}

}