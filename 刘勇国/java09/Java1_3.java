import java.util.*;
public class Java1_3{
	public static void main(String[] args){
		char[] arr={'a','c','u','b','e','p','f','z'};
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		Arrays.sort(arr);
		System.out.println("\nÅÅÐòºó");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println("\nµ¹Ðòºó");
		for(int i=arr.length;i<0;i++){
			System.out.print(arr[i]+"\t");
		}
	}
}