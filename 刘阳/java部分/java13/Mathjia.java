package zuoye;

	public class Mathjia {
	int maxnum;
	int gwnum;
	int lifang;
	int sum;
	public int max(int a,int b){
		if(a>b){
			maxnum=a;
		}else{
			maxnum=b;
		}
		return maxnum;
	}
	public int gw(int c){
		gwnum=c%10;
		return gwnum;
	}
	public int lf(int a){
		lifang=a*a*a;
		return lifang;
	}
	public int leijia(int a){
		sum=0;
		for(int i=1;i<=a;i++){
			sum+=i;s
		}
		return sum;
	}
}
