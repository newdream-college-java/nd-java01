import java.util.*;
public class work6{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数n：");
		int a= input.nextInt();
		int count=0,m=0;
		for(int i=1;i<=a;i++){
			if(i%2==0){
				count++;
			}
			if(!(i%2==0)){
				m++;
			}	

		}
		System.out.print("1到"+a+"的偶数有"+count+"个\t"+"1到"+a+"的奇数有"+m+"个\t");
	}
}