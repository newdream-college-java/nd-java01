import java.util.Arrays;
import java.util.Scanner;
public class Test8{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String[] arr=new String[]{"Island","Ocean","Pretty","Sun","0"};
		System.out.print("插入后的数组为：");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.print("请输入一首歌的名字：");
		arr[arr.length-1]=input.next();
		Arrays.sort(arr);
		String temp;
		System.out.print("插入后的数组为：");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		
		
	}
	
}