import java.util.Arrays;
public class Z3{
	public static void main(String[] args){
		char[] arr={'a','c','u','b','e','p','f','z'};
		System.out.print("ԭ�ַ�����");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			
		}
		Arrays.sort(arr);
		System.out.print("\n���������");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			
		}		
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<arr.length-i;j++){
				
				if(arr[j]<arr[j+1]){
					char min=0;
					min=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=min;
				}
			}	
			
		}
		System.out.print("\n��������Ϊ��");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			
		}
		
	
	}
}