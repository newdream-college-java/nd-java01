/*假设有一个长度为5的数组int [] array=new int[]{1,3，-1,5，-2}现创建一个新数组newArray[]，要求新数组中元素的存放顺序与原数组的元素逆序，并且如果原数组的元素值小于0，在新数组按0存储。编程输出新数组数据*/
public class Test07{
	public static void main(String[] args){
		int[] array={1,3,-1,5,-2};
		for(int i=array.length-1;i>=0;i--){
			if(array[i]<0){
				array[i]=0;
			}
			System.out.print(array[i]+"\t");
		}
	}
}