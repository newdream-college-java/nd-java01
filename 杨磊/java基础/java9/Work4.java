package zuoye;

import java.util.Arrays;

public class Work4 {

	public static void main(String[] args) {
		char[] a={'a','c','u','b','e','p','f','z','\u0000'};
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+",");
		}
		System.out.println();
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+",");
		}
		int count =0;//定义一个变量
		for(int i=0;i<a.length-1;i++){
			if(a[i]>'m'){
				count=i;
				break;
			}//判读比m大的数的位置
		}
		for(int i=0;i<count-1;i++){
			 char temp=a[i];
			 a[i]=a[i+1];
			 a[i+1]=temp;
		}//比m小的给m腾位置
		a[count-1]='m';//赋值将m塞进数组相应的位置
		System.out.println();
		System.out.println(count);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+",");
		}//输出

	}

}
