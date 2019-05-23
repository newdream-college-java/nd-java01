public class Test4{
	public static void main(String[] args){
		int a=1,b=0;
		for(int i=1;i<=10;i++){
			a=i*a;
			b+=a;
		}
		System.out.println(b);
	}
}