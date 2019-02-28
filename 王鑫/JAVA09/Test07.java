package Test2019_2_28;

public class Test07 {
	public static void main(String[] args) {
		int[] array = {1,3,-1,5,-2};
		int[] newArray = new int[5];
		for (int i = 0; i < newArray.length; i++) {
			if (array[i]<0) {
				newArray[newArray.length-i-1]=0;
			}else {
				newArray[newArray.length-i-1]=array[i];
			}
		}
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}
	}
}
