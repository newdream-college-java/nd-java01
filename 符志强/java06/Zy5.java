/*求100-999之间的水仙花数：153=1*1*1+5*5*5+3*3*3  */
public class Zy5{
	public static void main(String[] args){
		for(int i=100,g,s,b,sxh;i<=999;i++){
			g=i%10;
			s=i/10%10;
			b=i/100;
			sxh=g*g*g+s*s*s+b*b*b;
			if(sxh==i){
			System.out.println(sxh);
			}
		}
	}
}