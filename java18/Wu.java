package java18;

public class Wu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		try {
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("进行抓获");
		}

	}
	

}
