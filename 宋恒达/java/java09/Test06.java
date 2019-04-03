/**
**假设有一个长度为5的数组int[] array=new int[]{1,3,-1,5,-1}现创建一个
**新数组new Array[],要求新数组中元素的存放顺序与原数组的元素逆序，并且如果原数组的元素值
**小于0，在新数组中按0存储。编程输出新数组数据
**/
import java.util.Arrays;
public class Test06{
	public static void main(String[] args) {
		//创建原数组
		int[] array=new int[]{1,3,-1,5,-2};
		//创建新数组
		int[] newArray=new int[array.length];
		//输出原数组
		System.out.print("原数组元素为:");
		for (int i=0;i<array.length ;i++ ) {
			System.out.print(array[i]+"\t");
		}
		System.out.println();
		//对原数组进行升序排序
		Arrays.sort(array);
		//输出升序后数组元素
		System.out.print("排序后的数组元素为:");
		for (int i=0;i<array.length ;i++ ) {
			System.out.print(array[i]+"\t");
		}
		System.out.println();
		//从原数组结束位置开始取元素，并一个个从新数组起始位置开始一个个加进去
		for (int i=0;i<array.length ;i++ ) {
			newArray[i]=array[array.length-i-1];
		}
		//输出新数组
		System.out.print("逆序的新数组元素为:");
		for (int i=0;i<newArray.length ;i++ ) {
			System.out.print(newArray[i]+"\t");
		}
		System.out.println();
	}
}