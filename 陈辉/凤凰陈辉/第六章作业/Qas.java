public class Qas{
	public static void main (String[]args){
		int i = 10000;
		int g,s,b,q,w;
		while(i<100000){
			g=i%10;
			s=i/10%10;
			b=i/100%10;
			q=i/1000%10;
			w=i/10000;
			
			if(g==w&&s==q){
				System.out.println(i);

				i++;
			}
		}
	
	}

}