import java.util.Arrays;
public class A03{
	public static void main(String[]args){
		char arr[]={'a','c','u','b','e','p','f','z'};
		System.out.println("ԭ����Ϊ��acubepfz");
		System.out.print("����");
		Arrays.sort(arr);
		System.out.println(arr);
		char k=0;
		System.out.print("����");
		for(int i=1;i<arr.length;i++){
			for(int m=0;m<arr.length-i;m++){
				if(arr[m]<arr[m+1]){
					k=arr[m];
					arr[m]=arr[m+1];
					arr[m+1]=k;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}
}