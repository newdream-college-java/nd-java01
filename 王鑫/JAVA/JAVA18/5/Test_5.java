package Test2019_3_17_z18;

public class Test_5 {
	public static void main(String[] args) {
		int[] arr = new	int[10];
		try {
			arr[10]=1;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界");
		}
	}
}
