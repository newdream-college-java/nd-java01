public class Qwq{
	public static void main (String[]args){
		int i = 100,g,s,b;
		while(i<1000){
			g=i%10;
			s=i/10%10;
			b=i/100;
			if(i==(g*g*g)+(s*s*s)+(b*b*b)){
				System.out.println(i);
				
			}
				i++;		
		}
	}

}