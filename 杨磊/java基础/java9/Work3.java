package zuoye;

import java.util.Arrays;

public class Work3 {

	public static void main(String[] args) {
		char[] a={'a','c','u','b','e','p','f','z'};//定义一个8个元素的数组
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+",");
		}//循环输出数组
		System.out.println();
		Arrays.sort(a);//排序
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+",");
		}//输出
		for(int i=0;i<a.length;i++){
			 for(int j=0;j<a.length-1-i;j++){
				 if(a[j]<a[j+1]){
					 char temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
				 }
			 }
		}//冒泡排序倒序
		System.out.println();
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+",");
		}//输出
	}

}
