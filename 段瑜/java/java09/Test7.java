import java.util.Scanner;
public class Test7{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] a={1,3,-1,5,-2};
		int j=4;
		int[] newArray;
		newArray =new int[5];
		for(int i=0;i<a.length;i++){
			newArray[i]=a[j];
			if(a[j]<0){
				newArray[i]=0;
			}
			j--;
		}
		System.out.print("新数组为：");
		for(int i=0;i<newArray.length;i++){
			System.out.print(newArray[i]+"\t");
		}
	}
}