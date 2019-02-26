public class work3{
	public static void main(String []args){
		System.out.println("Êä³ö1900-2012µÄÈòÄê£º");
		for(int i=1900;i<=2012;i++){
			if((i%4==0&&i%100!=0)||(i%400==0)){
				System.out.print(i + "\t");
			}
		}
	}
}