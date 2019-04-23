/*输出1900到2012年的闰年*/
public class Hw03{
	public static void main(String[] args){
		int i=1900;
		for(;i<=2012;i++){
			if((i%4==0)&&(i%100!=0)||(i%400==0)){
				System.out.println(i);
			}
		}
	}
}