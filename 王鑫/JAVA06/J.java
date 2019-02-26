//求100-999的水仙花数。如（153=1*1*1+5*5*5+3*3*3）


public class J{
	public static void main(String[] args){
		for(int i=100 ; i< 1000 ; i++ ){
			if(i==Math.pow(i/100,3)+Math.pow(i/10%10,3)+Math.pow(i%10,3)){
				System.out.println(i);
			}
		}
	}
} 
