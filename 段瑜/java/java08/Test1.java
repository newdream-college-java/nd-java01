public class Test1{
	public static void main(String[] args){
		int sum=0,i=1;
		for(;i<101;i++){
			sum+=i;
			if(sum>500){
				break;
			}
		}
		System.out.println("�ۼӴ���500ʱ�ӵ�"+i);
	}
}