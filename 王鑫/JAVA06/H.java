//输出1900-2012年的闰年。

public class H{
	public static void main(String[] arge){
		for(int i =1900 ; i<2012 ; i++){
			if(i%4==0&&i%100!=0||i%400==0){
				System.out.println(i);
			}
		}
	}
}