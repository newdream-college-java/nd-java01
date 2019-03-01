public class Hw07{
	public static void main(String[] args){
		int[] array=new int[]{1,3,-1,5,-2};
		System.out.print("newArray数组的数据为：");
		for(int i=array.length-1;i>=0;i--){
			if(array[i]<0){
				System.out.print("0"+" ");
			}else{
				System.out.print(array[i]+" ");
			}
		}
	}
}