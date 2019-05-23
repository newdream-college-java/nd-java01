import java.util.Scanner;
import java.util.Arrays;
public class Test4{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		char[] a=new char[]{'a','c','u','b','e','p','f','z','0'};
		System.out.print("元字符序列：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
		Arrays.sort(a);
		System.out.print("\n升序后字符序列：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}	
		System.out.print("\n请输入一个字符：");
		String b=input.next();
		a[0]=b.charAt(0);
		int index=-1;
		for(int i=1;i<a.length;i++){
			if(a[0]<a[i]){
				index=i-1;
				break;
			}
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println("\n插入的位置是："+index);
	}
}