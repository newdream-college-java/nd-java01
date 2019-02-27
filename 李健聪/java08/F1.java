public class F1{
	public static void main(String[] args){
		int count=0;
		for(int i=1;i<=4;i++){
			for(int j=0;j<count;j++){  //int j是局部变量 
				System.out.print(" ");
			}
			count++;
			System.out.println("************");
		}
	}
}