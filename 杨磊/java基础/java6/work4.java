//输出10000-99999里面所有的回文数；
public class work4{
	public static void main(String []args){
		for(int i=10000;i<=99999;i++){			
			if((i%10==i/10000)&&(i/10%10==i/1000%10)){
				System.out.print(i + "\t");
			}
		}
	}

}