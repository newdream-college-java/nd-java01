public class F2{
	public static void main(String[] args){
		int count=4;  //定义一个count
		for(int i=1;i<=4;i++){
			for(int j=1;j<=count;j++){
				System.out.print("*");
			}
			count--;
			System.out.println();
		}
	}
}