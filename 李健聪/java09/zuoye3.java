import java.util.Arrays;
public class zuoye3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]={'a','c','u','b','e','p','f','z'};
		System.out.print("Ô­ĞòÅÅĞòÎª:");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.print("ÉıĞòÅÅĞòºó:");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("½µĞòÅÅÁĞÎª:");
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
		
	}

}
