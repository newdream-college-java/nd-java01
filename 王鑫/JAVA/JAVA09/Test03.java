package Test2019_2_28;

import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		String[] arr = {"a","c","u","b","e","p","f","z"};
		System.out.print("ԭ�ַ����У�");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr);
		System.out.print("\n���������");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n�������Ϊ��");
		for (int i = arr.length-1; i >=0 ; i--) {
			System.out.print(arr[i]+" ");			
		}
	}
}
