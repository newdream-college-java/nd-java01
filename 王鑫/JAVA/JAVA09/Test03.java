package Test2019_2_28;

import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		String[] arr = {"a","c","u","b","e","p","f","z"};
		System.out.print("Ô­×Ö·ûĞòÁĞ£º");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr);
		System.out.print("\nÉıĞòÅÅĞòºó£º");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("\nÄæĞòÊä³öÎª£º");
		for (int i = arr.length-1; i >=0 ; i--) {
			System.out.print(arr[i]+" ");			
		}
	}
}
