/**
**有一组英文歌曲，按照字母顺序从“A”到“Z”排列，保存在一个数组中。现在要这恩加一首歌
**插入数组，并保持歌曲名称升序排列。
**/
import java.util.Scanner;
public class Test07{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//创建原数组
		String[] array=new String[5];
		array[0]="Island";
		array[2]="Ocean";
		array[1]="Pretty";
		array[3]="Sun";
		//输出插入前的数组
		System.out.print("插入前的数组为:");
		for (int i=0;i<array.length;i++ ) {
			System.out.print(array[i]+"\t");
		}
		System.out.println();
		//对原数组进行排序
		for (int i=0;i<array.length-2 ;i++ ) {
			for (int j=0;j<array.length-2-i ;j++ ) {
				if (array[j].compareTo(array[j+1])>0){
					String temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		//输出排序后的数组元素
		System.out.print("排序后的数组元素为:");
		for (int i=0;i<array.length ;i++ ) {
			System.out.print(array[i]+"\t");
		}
		System.out.println();
		//输入插入的歌曲名称
		System.out.print("请输入需要插入的歌曲名：");
		String song=input.next();
		int index=-1;
		//寻找插入的位置，并保存
		for (int i=0;i<array.length-1 ;i++ ) {
			if (array[i].compareTo(song)>0) {
				index=i;
				break;
			}
			index=array.length-1;
		}
		//将插入位置后的元素均向后移一位
		for (int i=array.length-2;i>=index ;i-- ) {
			array[i+1]=array[i];
		}
		//将插入的元素插入到寻找到位置
		array[index]=song;
		//输出插入元素后的数组元素
		System.out.print("插入后的数组为:");
		for (int i=0;i<array.length ;i++ ) {
			System.out.print(array[i]+"\t");
		}
		System.out.println();
	}
}