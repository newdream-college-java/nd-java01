import java.util.Arrays;
public class A07{
	public static void main(String[]args){
		int [] array =new int[]{1,3,-1,5,-2};
		int [] arr= new int[]{5};
		System.out.println(array);//原来的数组
		for(int i=5-1;i>=0;i--){//逆序输出
			System.out.print(array[i]+"\t");
			
		}
		System.out.println();
		for(int i=5-1;i>=0;i--){
			if(array[i]<0){
				array[i]=0;
			}
			System.out.print(array[i]+"\t");
		}
	}
}