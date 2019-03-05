import java.util.Scanner;
public class Java1_8{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		String []arr = new String[5];
		arr[0]="Island";
		arr[1]="Ocean";
		arr[2]="Pretty";
		arr[3]="Sun";
		String temp;
		System.out.println("插入的数组为：");
		for(int i=0;i<arr.length-1;i++){
			System.out.println(arr[i]+"\t");
		}
		System.out.println("插入的歌曲名称为：");
		arr[4]=input.next();
		for(int i=0;i<arr.length;i++){
			if(arr[arr.length-1].compareTo(arr[0])<=0){
				temp=arr[arr.length-1];
				for(int j=arr.length-1;j>0;j--){
					arr[j]=arr[j-1];
				}	
				arr[0]=temp;
			}else if(arr[4].compareTo(arr[i])<=0){
				temp=arr[4];
				for(int j=arr.length-1;j>=i;j--){
					arr[j]=arr[j-1];
				}
				arr[i]=temp;
			}
		}
		System.out.println("插入后的数组为：");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}

	}
}