public class A{
	public static void main(String[]args){
		int sum =0;
		int i =1;
		for(;i<=100;i++){
			sum=sum+1;
			if(sum>500){
				//System.out.println("此时加到"+i);
				break;
				//System.out.println("此时加到"+i);
			}
		}		System.out.println("此时加到"+i);
	}
}