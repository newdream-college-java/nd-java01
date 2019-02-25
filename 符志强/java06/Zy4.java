/*回文数    12321  ： 前后相等*/
public class Zy4{
	public static void main(String[] args){
		int g,s,b,q,w;
		for(int i=10000;i<=99999;i++){
			g=i%10;
			s=i/10%10;
			b=i/100%10;
			q=i/1000%10;			
			w=i/10000;
			if(g==w&&s==q){
				System.out.println(i+"是回文");
			}
		}
	}
}