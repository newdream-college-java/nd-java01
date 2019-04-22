/*输出所有万位的回文数*/
public class Hw04{
	public static void main(String[] args){
		int i=10000,gw,sw,qw,ww;
		for(;i<=99999;i++){
			gw=i%10;
			sw=i/10%10;
			qw=i/1000%10;
			ww=i/10000%10;
			if(gw==ww&&sw==qw){
				System.out.println(i);
			}
		}
	}
}