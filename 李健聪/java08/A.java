public class A{
	public static void main(String[] args){
		int sum=0;
		for(int i=1;i<=100;i++){
			sum+=i;
			if(sum>500){
				System.out.println("当加到"+i+"时输出超过500强制结束");
				System.exit(-1);
			}
		}
	}
}