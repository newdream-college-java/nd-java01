import java.util.Scanner;
import java.util.Arrays;
public class Z4{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		char[] arr={'a','c','u','b','e','p','f','z','0'};
		System.out.print("ԭ�ַ�����");
		for(int i=0;i<arr.length-1;i++){
			System.out.print(arr[i]+" ");
			
		}
		Arrays.sort(arr);
		System.out.print("\n���������");
		for(int i=1;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			
		}
		System.out.print("\n������һ���ַ���");
		String a=input.next();
		arr[0]=a.charAt(0);
		int index=-1;
		if(arr[0]>arr[arr.length-1]){
			index=arr.length-1;
		}if(arr[0]==arr[arr.length-1]){
			index=arr.length-2;
		}if(arr[0]<=arr[1]){
			index=0;
		}
		for(int i=1;i<arr.length;i++){
			if(arr[arr.length-1]>arr[0]&&arr[0]>arr[i-1]){
				index=i-1;
				
			}
		}
		Arrays.sort(arr);
		System.out.print("\n�����ַ�����ַ�����:");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			
		}
		System.out.print("\n�����λ����:"+index);
		
			
		
	
	}
}