public class A{
	public static void main(String[] asgr){
		int a=0,i=1;
		while(i<101){
			if(i%2!=0){
				a+=i;
			}
			i++;
		}
		System.out.println("100以内奇数的和为："+a);
	}
}