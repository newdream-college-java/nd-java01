/*求1*2*3*····*10的结果*/
public class Hw06{
	public static void main(String[] args){
		int sum=1;
		for(int i=1;i<=10;i++){
			sum*=i;
		}
		System.out.print("1*2*3*····*10的结果为："+"\t"+sum);
	}
}