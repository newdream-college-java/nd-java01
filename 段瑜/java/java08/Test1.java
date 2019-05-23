public class Test1{
	public static void main(String[] args){
		int sum=0,i=1;
		for(;i<101;i++){
			sum+=i;
			if(sum>500){
				break;
			}
		}
		System.out.println("累加大于500时加到"+i);
	}
}