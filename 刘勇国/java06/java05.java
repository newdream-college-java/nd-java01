public class java05{
	public static void main(String[] args){
	int sum=0;
	for(int i=100;i<1000;i++){
		int a =i/100;
		int b=i/10%10;
		int c=i%10;
		if(i==a*a*a+b*b*b+c*c*c){
			sum++;
		}
	}
	System.out.println("水仙花数共有"+sum+"个");
	}
}