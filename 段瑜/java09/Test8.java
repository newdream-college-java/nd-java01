import java.util.Arrays;
import java.util.Scanner;
public class Test8{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String[] arr=new String[]{"Island","Ocean","Pretty","Sun","0"};
		System.out.print("����������Ϊ��");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.print("������һ�׸�����֣�");
		arr[arr.length-1]=input.next();
		Arrays.sort(arr);
		String temp;
		System.out.print("����������Ϊ��");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		
		
	}
	
}