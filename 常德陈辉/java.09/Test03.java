/*将一组乱码的字符进行升序排序 创建数组存储原字符序列利用Array类的sort（）方法对数组进行排序，并循环输出从最后一个元素开始，将数组中的元素逆序输出*/
import java.util.Arrays;
public class Test03{
	public static void main(String[] args){
		String[] arr={"a","c","u","b","e","p","f","z"};
		System.out.print("原字符序列：");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		Arrays.sort(arr);
		System.out.print("\n升序排序后：");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.print("\n逆序输出为：");
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+"\t");
		}
	}
}