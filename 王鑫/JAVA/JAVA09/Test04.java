package Test2019_2_28;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		char[] arr = {'a','c','u','b','e','p','f','z'};
		char[] brr = new char[9];
		int t=0;
		Scanner input = new Scanner(System.in);
		System.out.print("原字符序列：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr);
		System.out.print("\n升序后字符序列：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			brr[i]=arr[i];
		}
		System.out.print("\n插入字符后的字符序列：");
		String a = input.next();
		char p= a.charAt(0);
		brr[8] = p;
		Arrays.sort(brr);
		System.out.print("插入字符后的字符序列：");
		for (int i = 0; i < brr.length; i++) {
			if (p==brr[i]) {
				t=i;
				break;
			}
		}
		for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i]+" ");			
		}
		System.out.println("\n插入的位置："+t);
	}
}
