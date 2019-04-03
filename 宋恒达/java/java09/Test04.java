/**
**像上一个练习得到的升序字符序列中插入一个新的字符，要求插入之后字符序列
**仍保持有序，修改上一个题目的代码，定义长度为9的数组，保持原字符序列，按上一题实现字符序列排序找
**到新增字符的插入位置 从插入位置开始的元素均后移一个位置 插入新的字符 并输出结果
**/
import java.util.Arrays;
import java.util.Scanner;
public class Test04{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//创建长度为9的数组
		char[] chars=new char[9];
		//将字符a,c,u,b,e,p,f,z存入数组
		chars[0]='a';
		chars[1]='c';
		chars[2]='u';
		chars[3]='b';
		chars[4]='e';
		chars[5]='p';
		chars[6]='f';
		chars[7]='z';
		//输出原字符序列
		System.out.print("原字符序列:");
		for (int i=0;i<chars.length-1;i++ ) {
			System.out.print(chars[i]+"\t");
		}
		System.out.println();
		//排序
		Arrays.sort(chars);
		//输出升序后的数组元素
		System.out.print("升序后字符序列:");
		for (int i=0;i<chars.length ;i++ ) {
			System.out.print(chars[i]+"\t");
		}
		System.out.println();
		//输入一个需要插入的字符
		System.out.print("请输入一个字符:");
		String a=input.next();
		char c=a.charAt(0);
		int index=0;
		for (int i=0;i<chars.length ;i++ ) {
			if (chars[i]>c) {
				index=i-1;
				break;
			}else{
				index=chars.length-1;
			}
		}
		//将数组中下标为index的元素及其前面的元素往前移一位
		//将输入的字符插入查找到的位置
		for (int i=1;i<=index ;i++ ) {
			chars[i-1]=chars[i];
		}
		chars[index]=c;
		//输出插入后的数组
		System.out.print("插入字符后的字符序列为:");
		for (int i=0;i<chars.length ;i++ ) {
			System.out.print(chars[i]+"\t");
		}
		System.out.println();
		System.out.println("插入位置是:"+index);
	}
}