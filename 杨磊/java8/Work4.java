//ÇóºÍ1£¡+2£¡+3£¡+4£¡+.....+10£¡
public class Work4{
	public static void main(String []args){
		int a=0;
		for(int i=1;i<=10;i++){
			int b = 1;
			for(int j=1;j<=i;j++){
				b=b*j;	
			}
			a=a+b;
		}
		System.out.print(a);
	}
}

