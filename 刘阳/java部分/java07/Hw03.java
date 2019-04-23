
public class Hw03{
	public static void main(String[] args){
		//每次加一乘2就等于前一天剩下的枣子数
		int sum=1;
		for(int i=1;i<10;i++){
			sum=(sum+1)*2;
		}
		System.out.print("最初有"+sum+"个枣子");
	}
}