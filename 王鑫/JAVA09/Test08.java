package Test2019_2_28;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//创建数组arr存未更改的字符串数组
		String[] arr = {"Island","Ocean","Pretty","Sun"};
		System.out.print("插入前的数组为：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("  "+arr[i]);
		}
		//输入的字符串
		System.out.print("\n输入歌曲名称：");
		String p = input.next();
		//创建一个字符串数组来存放插入后的数组
		String[] brr = new String[5];
		//循环判断开始插入       
		for (int i = 0; i < arr.length; i++) {
			if (p.compareTo(arr[i])<0) {
				//开始插入
				for (int j = brr.length-1; j >i; j--) {
					brr[j]=arr[j-1];
				}
				brr[i]=p;
				break;
			}else{
				brr[i]=arr[i];					
			}
		}
		for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i]+" ");
		}
	}
}
