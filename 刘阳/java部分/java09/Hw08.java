import java.util.Arrays;
import java.util.Scanner;
public class Hw08{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String[] str={"Island","Ocean","Pretty","Sun"};
		System.out.print("插入前的数组为：");
		for(int i=0;i<str.length;i++){
			System.out.print(str[i]+"\t");
		}
		System.out.print("\n"+"请输入歌曲名称：");
		String num=input.next();
		String[] arr=new String[5];
		for(int i=0;i<arr.length-1;i++){
			arr[i]=str[i];
		}
		arr[arr.length-1]=num;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		
	}
}