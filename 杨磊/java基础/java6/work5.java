//Ë®ÏÉ»¨Êý£»
public class work5{
	public static void main(String []args){
		for(int i=100;i<=999;i++){	
			int gw = i%10;	
			int sw = i/10%10;
			int bw = i/100;	
			if(i==gw*gw*gw+sw*sw*sw+bw*bw*bw){
				System.out.print(i + "\t");
			}
		}
	}

}