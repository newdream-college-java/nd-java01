/**
**���1900-2012������
**/

public class Test03{
	public static void main(String[] args){
		int i=1900;
		while(i<=2012){
			if((i%4==0&&i%100!=0)||(i%400==0)){
				System.out.println(i+"����"+"����");
			}
			i++;
		}
	}
}