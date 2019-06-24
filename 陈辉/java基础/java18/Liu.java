package java18;

public class Liu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		try {
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			Object log;
			((Object) log).debug("");
		}

	}

}
