public class Java03{
	public static void main(String[] args){
		/*
		
		*/
		int sum=1;
		System.out.println("第1天有"+sum+"枣");
		for(int i=1;i<10;i++){
				sum=2*(sum+1);
		
			System.out.println("第"+(i+1)+"天"+"有"+sum+"个枣");
		}
		System.out.println("共有"+sum+"枣");
	}
}  

/*
设一共有N个枣		吃了的Y个枣
	第一天吃了N/2-1=Y	N=2*（Y+1）


*/