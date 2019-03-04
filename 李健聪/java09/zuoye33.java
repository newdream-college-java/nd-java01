import java.util.Arrays;
import java.util.Scanner;


public class zuoye33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		char arr[]={'a','c','u','b','e','p','f','z'};
		char[] brr=new char[9];
		int t=0;
		System.out.print("原字符序列为:");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.print("升序后的字符序列为:");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			brr[i]=arr[i];
		}
		System.out.println();
		System.out.print("请插入一个新的字符:");
		String a=input.next();
		char c=a.charAt(0);//获取字符串a的第一个字符，将其赋值给字符变量c。 
		brr[8]=c;
		Arrays.sort(brr);
		System.out.println();
		System.out.print("插入字符后的排序为：");
		for(int i=0;i<brr.length;i++){
			if(brr[i]==c){
				t=(i+1);
			}
			System.out.print(brr[i]+" ");
		}
		System.out.println("插入的字符位置为"+t);
		
	}

}
