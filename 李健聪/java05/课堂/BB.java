//求1~100的和当大于500时，i的位数
public class BB{
	public static void main(String[] args){
		int i=1,sum=0;
		while(i<=100){
			sum+=i;
			i++;
			if(sum>500){
				System.out.println("当和大于500时，加到"+(i-1)+"位数");
				System.exit(-1);
			}
			
			
		}
	}
}