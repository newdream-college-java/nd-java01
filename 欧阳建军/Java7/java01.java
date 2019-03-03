public class java01{
	public static void main(String[] args){
		int sum=0;
		int j=0;
		for(int i=1;i<=100;i++){
			if(i%2!=0){
			sum+=i;
			j++;
			}
		}
		System.out.println("100内的奇数之和为:"+sum+"\t\t"+j);
	}
}