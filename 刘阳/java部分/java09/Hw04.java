import java.util.Arrays;
import java.util.Scanner;
public class Hw04 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int i;
		char[] str= {'a','c','u','b','e','p','f','z'};
		System.out.print("原字符序列：");
		for(i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
		Arrays.sort(str);
		System.out.println("\n");
		System.out.print("升序排序后：");
		for(i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println("\n");
		System.out.print("请输入一个字符:");
		String zm=input.next();
		char c=zm.charAt(0);
		char[] arr=new char[9];
		//创建一个新的数组，比原数组长度大1，然后把原数组元素复制到前8个位置.
		for(i=0;i<str.length;i++){
			arr[i]=str[i];
		}
		//确定要插入的位置
		int index=0;
		for(i=0;i<arr.length;i++){
			if(arr[i]>c){
				index=i;
				break;
			}
		}
		//从插入位置开始所有数后移一个位置；顺便把默认值给替换覆盖掉
		for(i=arr.length-2;i>=index;i--){
			arr[i+1]=arr[i]; 
		}
		arr[index]=c;
		System.out.println("\n");
		System.out.print("插入字符后的字符序列：");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		System.out.print("插入的位置是："+index);
	}

}