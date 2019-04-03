//统计和正负数个数，输入999为结束。


import java.util.Scanner;

public class D{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		int z=0,f=0,l=0;
		for(int n = input.nextInt(); n !=999;){
			if(n>0){
				z++;
			}else if(n<0){
				f++;
			}else{
				l++;
			}
		}
		System.out.print("大于0的个数："+z+"\n等于0的个数："+l+"\n小于0的个数："+f);	
	}	
}