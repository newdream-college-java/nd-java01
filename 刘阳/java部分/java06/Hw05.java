/*求100~999之间的水仙花数*/
public class Hw05{
	public static void main(String[] args){
		int i=100,gw,sw,bw;
		for(;i<=999;i++){
			gw=i%10;
			sw=i/10%10;
			bw=i/100%10;
			if(i==(gw*gw*gw)+(sw*sw*sw)+(bw*bw*bw)){
				System.out.println(i);
			}
		}
	}
}			//算出来答案是四个数：153；370；371；407