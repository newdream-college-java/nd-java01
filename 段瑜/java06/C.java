public class C{
	public static void main(String[] args){
		int i=1990;
		while(i<2013){
			if(i%4==0&&i%100!=0||i%400==0){
				System.out.println(i+"ÊÇÈòÄê");
			}
			i++;
		}
	}
}