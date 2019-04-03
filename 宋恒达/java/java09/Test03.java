/**
**将一组乱序的字符进行升序排序 创建数组存储原字符序列
**利用Array类的sort（）方法对数组进行排序，并循环输出 从最后一个元素开始，
**将数组中的元素逆序输出
**/
import java.util.Arrays;
public class Test03{
	public static void main(String[] args) {
		//创建原字符数组
		char[] chars={'a','c','u','b','e','p','f','z'};
		//输出原字符数组
		System.out.print("原字符序列:");
		for (int i=0;i<chars.length ;i++ ) {
			System.out.print(chars[i]+"\t");
		}
		System.out.println();
		//利用sort()进行排序
		Arrays.sort(chars);
		//输出排序后的数组
		System.out.print("升序排序后:");
		for (int i=0;i<chars.length ;i++ ) {
			System.out.print(chars[i]+"\t");
		}
		System.out.println();
		//逆序输出
		System.out.print("逆序排序后:");
		for (int i=chars.length-1;i>=0;i-- ) {
			System.out.print(chars[i]+"\t");
		}
	}
}