package Test5;

public class Test05 {
	public static void main(String[] args) {
		try{
			int[] arr=new int[3];
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
	}
}
