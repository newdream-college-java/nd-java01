//ͳ�ƺ�����������������999Ϊ������


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
		System.out.print("����0�ĸ�����"+z+"\n����0�ĸ�����"+l+"\nС��0�ĸ�����"+f);	
	}	
}