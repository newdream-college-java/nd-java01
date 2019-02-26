import java.util.Scanner;
public class Zy4{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("输入一个数");
		int a=input.nextInt();
		int l=0,f=0,z=0;
		while(a!=999){
			
			if(a==0){
				l++;
			}
			if(a<0){
				f++;
			}
			if(a>0){
				z++;
			}
			a=input.nextInt();	
		}
		System.out.print("0的个数"+l+"\n负数的个数"+f+"\n正数的个数"+z);
	}
}