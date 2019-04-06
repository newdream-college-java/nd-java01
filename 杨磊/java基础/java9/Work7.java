package zuoye;

import java.util.Arrays;

public class Work7 {

	public static void main(String[] args) {
		int[] a = {1,3,-1,5,-2};
		int[] b=new int[a.length];
		
		//打印出a数组做测试
//		for(int i=0;i<a.length;i++){
//			System.out.println(a[i]);
//			
//		}
		//小于0的转为0
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			if(a[i]<0){
				a[i]=0;
			}
			b[i]=a[i];
		}
		for(int i=0;i<b.length-1;i++){
			for(int j=0;j<b.length-i-1;j++){
				if(b[j]<b[j+1]){
					int temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
				}
			}
		}
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]+"\t");
		}

	}

}
