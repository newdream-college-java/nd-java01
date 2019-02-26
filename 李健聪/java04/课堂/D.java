public class D{
	public static void main(String[] args){
		int a=0,b=1,i=1;
		while(i<=20){
			System.out.println(a+b);
			a+=b;
			b=a-b;
			i++;
		}
	}
}